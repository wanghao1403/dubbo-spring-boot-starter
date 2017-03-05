package com.lizo.spring.dubbo.demo.provider.simpleexample;

import com.lizo.spring.dubbo.boot.annotation.EnableDubbo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * Created by lizhou on 2017/2/28/028.
 */
@SpringBootApplication
@EnableDubbo(basePackages = "com.lizo.spring.dubbo.demo.provider")
public class Provider {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = new SpringApplicationBuilder()
                .sources(Provider.class)
                .web(false) //把项目设置成非web环境
                .run(args);
        new CountDownLatch(1).await();
    }
}

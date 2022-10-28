package com.buba.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @ClassName PayMentMain
 * @Description TODO
 * @Author LHQ
 * @Date 2022/10/24 16:05
 */
@EnableDiscoveryClient
@SpringBootApplication
//该注解支持nacos的动态刷新的功能，Springcloud原生的注解，实现配置自动更新
@RefreshScope
public class PayMentMain {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain.class,args);
    }
}

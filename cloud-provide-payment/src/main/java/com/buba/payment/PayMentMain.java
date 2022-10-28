package com.buba.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName PayMentMain
 * @Description TODO
 * @Author LHQ
 * @Date 2022/10/24 16:05
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PayMentMain {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain.class,args);
    }
}

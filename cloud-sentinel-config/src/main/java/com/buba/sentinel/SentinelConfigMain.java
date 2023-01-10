package com.buba.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName SentinelConfigMain
 * @Description TODO
 * @Author LHQ
 * @Date 2023/1/9 18:54
 */

@SpringBootApplication
@EnableDiscoveryClient
public class SentinelConfigMain {
   public static void main(String[] args) {
      SpringApplication.run(SentinelConfigMain.class,args);
   }

}

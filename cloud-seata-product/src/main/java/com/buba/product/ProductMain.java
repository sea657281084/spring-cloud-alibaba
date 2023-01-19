package com.buba.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @ClassName ProductMain
 * @Description TODO
 * @Author LHQ
 * @Date 2023/1/19 17:09
 */
@SpringBootApplication
@EnableDiscoveryClient
//该注解支持nacos的动态刷新的功能，Springcloud原生的注解，实现配置自动更新
@RefreshScope
public class ProductMain {
   public static void main(String[] args) {
      SpringApplication.run(ProductMain.class,args);
   }
}

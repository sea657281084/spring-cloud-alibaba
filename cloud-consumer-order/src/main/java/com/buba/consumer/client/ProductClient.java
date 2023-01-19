package com.buba.consumer.client;

import com.buba.springcloud.pojo.seata.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName ProductClient
 * @Description TODO
 * @Author LHQ
 * @Date 2023/1/18 16:03
 */
@FeignClient(name = "mcroservice-product")
public interface ProductClient {

   @RequestMapping("/product/{pid}")
   public Product findProductByPid(@PathVariable("pid") Integer pid);

   @RequestMapping("/product/reduceStock")
   void reduceStock(@RequestParam("pid") Integer pid, @RequestParam("number") Integer number);
}

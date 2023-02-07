package com.buba.product.controller;

import com.buba.product.service.ProductService;
import com.buba.springcloud.pojo.seata.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author LHQ
 * @Date 2023/1/18 15:55
 */

@RestController
@RequestMapping("/product")
@Slf4j
public class ProductController {

   @Autowired
   ProductService productService;

   //根据id查询对应的商品信息
   @RequestMapping("/{pid}")
   public Product findProductByPid(@PathVariable("pid") Integer pid){
      Product product = productService.findProductByPid(pid);
      //JSON.toJSONString  把指定数据转换成json串
      log.info("[Product] 查询到的对应的商品是:" + product.toString());
      return product;
   }

   //扣减库存
   @RequestMapping("/reduceStock")
   public void reduceStock(@RequestParam("pid") Integer pid, @RequestParam("number") Integer number){
      productService.reduceStock(pid,number);
   }
}

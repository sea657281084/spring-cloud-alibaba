package com.buba.sentinel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName FlowLimitController
 * @Description TODO
 * @Author LHQ
 * @Date 2023/1/9 18:56
 */

@RestController
public class FlowLimitController {
   @GetMapping("/testA")
   public String testA() {
      return "------testA";
   }

   @GetMapping("/testB")
   public String testB() {

      return "------testB";
   }
}

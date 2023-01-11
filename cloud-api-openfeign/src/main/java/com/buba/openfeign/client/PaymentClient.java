package com.buba.openfeign.client;

//import com.buba.openfeign.hystrix.RemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.buba.springcloud.pojo.CommonResult;
import com.buba.springcloud.pojo.Payment;

/**
 * 通过@FeginClient注解指定被调用方的服务名,就是在Nacos-server服务列表中的服务名
 * 通过fallback属性指定RemoteHystrix类，来进行远程调用的熔断和降级处理。
 */
@Component
@FeignClient(value = "mcroservice-payment") //
public interface PaymentClient {

   //这里的访问路径是原接口的相对访问路径
   @GetMapping("/payment/get")
   CommonResult<Payment> paymentGet(@PathVariable("id") Long id);
}



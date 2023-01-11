package com.buba.openfeign.hystrix;

import com.buba.openfeign.client.PaymentClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import com.buba.springcloud.pojo.CommonResult;
import com.buba.springcloud.pojo.Payment;

/**
 * @ClassName RemoteHystrix
 * @Description TODO
 * @Author LHQ
 * @Date 2023/1/10 16:56
 */
@Component
public class RemoteHystrix implements PaymentClient {

   @Override
   public CommonResult<Payment> paymentGet(@PathVariable("id") Long id) {
      CommonResult<Payment> result = new CommonResult<>();
      result.setCode(200);
      result.setMessage("服务器繁忙");
      return result;
   }
}



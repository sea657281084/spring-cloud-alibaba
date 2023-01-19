package com.buba.consumer.controller;


import com.buba.consumer.client.PaymentClient;
import com.buba.consumer.service.OrderService;
import com.buba.springcloud.pojo.CommonResult;
import com.buba.springcloud.pojo.Payment;
import com.buba.springcloud.pojo.seata.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {
    //调用支付订单服务端的ip+端口号
//    public static final  String PAYMENT_URL = "http://localhost:8001";
    public static final  String PAYMENT_URL = "http://mcroservice-payment";

    @Resource
    private PaymentClient paymentClient;

    @Autowired
    private RestTemplate restTemplate;
    //创建支付订单的接口
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment, CommonResult.class);
    }
    //获取id获取支付订单
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);

    }

    //获取id获取支付订单
    @GetMapping("/getPaymentOpenFegin/get/{id}")
    public CommonResult<Payment> getPaymentOpenFegin(@PathVariable("id") Long id) {
        CommonResult<Payment> paymentCommonResult = paymentClient.paymentGet(id);
        return paymentCommonResult;

    }
// -----------------------------------------------------------------------------------------
    @Autowired
    OrderService orderService5;

    @RequestMapping("/createOrder/{pid}")
    public Order order(@PathVariable("pid") Integer pid){
        return orderService5.createOrder(pid);
    }
}

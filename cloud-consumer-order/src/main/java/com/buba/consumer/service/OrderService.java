package com.buba.consumer.service;


import com.buba.springcloud.pojo.seata.Order;

/**
 * @ClassName OrderService
 * @Description TODO
 * @Author LHQ
 * @Date 2023/1/18 15:58
 */
public interface OrderService {

   Order createOrder(Integer pid);
}

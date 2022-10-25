package com.buba.payment.service;

import com.buba.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentService
 * @Description TODO
 * @Author LHQ
 * @Date 2022/10/25 17:35
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment queryById(@Param("id")long id);
}

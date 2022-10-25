package com.buba.payment.dao;

import com.buba.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @ClassName PaymentDao
 * @Description TODO
 * @Author LHQ
 * @Date 2022/10/25 17:33
 */
@Mapper
@Repository
public interface PaymentDao {
    int create(Payment payment);

    Payment queryById(@Param("id") long id);
}

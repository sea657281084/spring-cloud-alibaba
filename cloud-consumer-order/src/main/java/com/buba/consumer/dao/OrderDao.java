package com.buba.consumer.dao;

import com.buba.springcloud.pojo.seata.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @ClassName OrderDao
 * @Description TODO
 * @Author LHQ
 * @Date 2023/1/18 16:31
 */
@Mapper
//@Repository
public interface OrderDao {

   void save(Order order);


}

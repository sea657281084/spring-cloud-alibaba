package com.buba.consumer.serviceImpl;

import com.buba.consumer.client.ProductClient;
import com.buba.consumer.dao.OrderDao;
import com.buba.consumer.service.OrderService;
import com.buba.springcloud.pojo.seata.Order;
import com.buba.springcloud.pojo.seata.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Author LHQ
 * @Date 2023/1/18 16:01
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

   @Autowired
   ProductClient productClient;

   @Autowired
   OrderDao orderDao;


   @Override
   public Order createOrder(Integer pid) {
      //查询指定的商品信息
      Product product = productClient.findProductByPid(pid);
      log.info("查询到的商品信息是：{}", product.toString());
      //执行下单的操作
      Order order = new Order();
      order.setUid(100);
      order.setUsername("SEA");
      order.setPid(pid);
      order.setPname(product.getPname());
      order.setPprice(product.getPprice());
      //设置订单中的商品数量
      order.setNumber(1);
      orderDao.save(order);
      log.info("订单创建成功，订单信息是:{}", order.toString());
      //执行扣减库存的操作
      productClient.reduceStock(pid,order.getNumber());
      return order;
   }
}

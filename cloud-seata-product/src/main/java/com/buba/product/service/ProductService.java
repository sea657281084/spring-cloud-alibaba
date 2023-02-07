package com.buba.product.service;

import com.buba.springcloud.pojo.seata.Product;

/**
 * @ClassName OrderService
 * @Description TODO
 * @Author LHQ
 * @Date 2023/1/18 15:58
 */
public interface ProductService {

   Product findProductByPid(Integer pid);

   void reduceStock(Integer pid, Integer number);
}

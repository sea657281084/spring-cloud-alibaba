package com.buba.product.serviceImpl;

import com.buba.product.dao.ProductDao;
import com.buba.product.service.ProductService;
import com.buba.springcloud.pojo.seata.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @ClassName ProductServiceImpl
 * @Description TODO
 * @Author LHQ
 * @Date 2023/1/18 18:14
 */
@Service
public class ProductServiceImpl implements ProductService {

   @Autowired
   ProductDao productDao;

   @Override
   public Product findProductByPid(Integer pid) {
      Product product = productDao.findById(pid);
      return product;
   }

   @Override
   public void reduceStock(Integer pid, Integer number) {
      System.out.println(1/0);
      Product product = productDao.findById(pid);
      product.setStock(product.getStock() -  number);
      productDao.update(product);
   }

}

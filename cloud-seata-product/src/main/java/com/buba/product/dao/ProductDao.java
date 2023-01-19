package com.buba.product.dao;

import com.buba.springcloud.pojo.seata.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName OrderDao
 * @Description TODO
 * @Author LHQ
 * @Date 2023/1/18 16:13
 */
@Mapper
public interface ProductDao {

//   List<Product> findListById(@Param("pid") Integer pid);

   Product findById(@Param("pid") Integer pid);

   void update(Product product);
}

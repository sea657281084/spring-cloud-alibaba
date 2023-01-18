package com.buba.springcloud.pojo.seata;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

/**
 * @ClassName Product
 * @Description TODO
 * @Author LHQ
 * @Date 2023/1/17 17:43
 */
//@Entity(name = "shop_product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Product {
//   @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer pid;//主键
   private String pname;//商品名称
   private Double pprice;//商品价格
   private Integer stock;//库存
}

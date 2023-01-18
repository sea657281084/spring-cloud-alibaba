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
 * @ClassName Order
 * @Description TODO
 * @Author LHQ
 * @Date 2023/1/17 18:15
 */
//@Entity(name = "shop_order")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Order {
//   @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long oid;//订单id
   private Integer uid;//用户id
   private String username;//用户名
   private Integer pid;//商品id
   private String pname;//商品名称
   private Double pprice;//商品单价
   private Integer number;//购买数量
}

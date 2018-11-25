package com.geekerit.order.repository;

import com.geekerit.order.OrderApplicationTests;
import com.geekerit.order.domain.OrderMaster;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
@Component
public class OrderMasterRepositoryTest extends OrderApplicationTests{
    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void savaTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123456");
        orderMaster.setBuyerName("Aaryn");
        orderMaster.setBuyerPhone("17788999988");
        orderMaster.setBuyerAddress("浙江省金华市");
        orderMaster.setBuyerOpenid("adsd15453db11");
        orderMaster.setOrderAmount(BigDecimal.valueOf(10.00));
        orderMaster.setOrderStatus(0);
        orderMaster.setPayStatus(0);
        orderMaster.setCreateTime(new Date());
        orderMaster.setUpdateTime(new Date());

        OrderMaster save = orderMasterRepository.save(orderMaster);

        if (null != save ){
            System.out.println("数据新增成功");
        }
    }
}
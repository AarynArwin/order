package com.geekerit.order.repository;

import com.geekerit.order.OrderApplicationTests;
import com.geekerit.order.domain.OrderDetail;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@Component
public class OrderDetailRepositoryTest extends OrderApplicationTests{

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void testSave(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456");
        orderDetail.setOrderId("123456");
        orderDetail.setProductId(1L);
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(BigDecimal.valueOf(8));
        orderDetail.setProductQuantity(2);
        orderDetail.setProductIcon("");

        OrderDetail save = orderDetailRepository.save(orderDetail);
        if (null != save){
            System.out.println("订单详情新增成功");
        }

    }
}
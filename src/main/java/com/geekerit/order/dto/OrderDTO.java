package com.geekerit.order.dto;

import com.geekerit.order.domain.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class OrderDTO {

    private String orderId;

    /** 买家姓名 */
    private String buyerName;
    /** 买家电话 */
    private String buyerPhone;
    /** 买家地址 */
    private String buyerAddress;
    /** 买家微信openID */
    private String buyerOpenid;
    /** 订单总金额 */
    private BigDecimal orderAmount;
    /** 订单状态（默认0新下单） */
    private Integer orderStatus;
    /** 支付状态（默认0未支付） */
    private Integer payStatus;

    private List<OrderDetail> orderDetails = new ArrayList<>();
}

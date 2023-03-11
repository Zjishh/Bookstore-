package com.demo.shopping.service;

import com.demo.shopping.dto.CartDto;
import com.demo.shopping.dto.OrdersDto;
import com.demo.shopping.pojo.Orders;
import com.demo.shopping.vo.R;

public interface OrderService {
    /**
     * 订单展示
     * @param cartDto
     * @return
     */
    R list(CartDto cartDto);

    /**
     * 待收货订单
     * @param cartDto
     * @return
     */
    R fa(CartDto cartDto);

    /**
     * 付款后订单添加
     * @param orders
     * @return
     */
    R add(Orders orders);

    /**
     * 商家修改订单的信息
     * @param ordersDto
     * @return
     */
    R save(OrdersDto ordersDto);

    /**
     * 确认收货
     * @param oid
     * @return
     */
    R deleted(int oid);


    /**
     * 查看全部订单
     * @param cartDto
     * @return
     */
    R zong(CartDto cartDto);
    /**
     * 商家订单
     * @param sid
     * @return
     */
    R shangjia(int sid);
}

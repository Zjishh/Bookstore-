package com.demo.shopping.service.impl;

import com.demo.shopping.dto.CartDto;
import com.demo.shopping.dto.OrdersDto;
import com.demo.shopping.mapper.OrderMapper;
import com.demo.shopping.pojo.Cart;
import com.demo.shopping.pojo.Orders;
import com.demo.shopping.service.OrderService;
import com.demo.shopping.vo.R;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: health
 *
 * @author: 杨玉斌
 * time: 2021/11/4 20:35
 * description:订单接口
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    /**
     * 订单展示
     *
     * @param cartDto
     * @return
     */
    @Override
    public R list(CartDto cartDto) {
        if (cartDto.getUid() != null) {
            List<Orders> orders = orderMapper.querylistOrder(cartDto);
            return R.OK("成功", orders);

        } else {

            return R.OK("请先登录！！！");
        }
    }

    /**
     * 待收货订单
     *
     * @param cartDto
     * @return
     */
    @Override
    public R fa(CartDto cartDto) {
        if (cartDto.getUid() != null) {
            List<Orders> orders = orderMapper.querylistfu(cartDto);
            return R.OK("成功", orders);

        } else {

            return R.OK("请先登录！！！");
        }
    }

    /**
     * 付款后订单添加
     *
     * @param orders
     * @return
     */
    @Override
    public R add(Orders orders) {
        int rows=0;
        try {
            rows=orderMapper.insert(orders);
        }catch (Exception e){}
        if(rows==0){
            return R.FAIL("失败");
        }
        return R.OK("成功");

    }

    /**
     * 商家修改订单的信息
     *
     * @param ordersDto
     * @return
     */
    @Override
    public R save(OrdersDto ordersDto) {
      Orders orders=new Orders();
      orders.setOid(ordersDto.getOid());
      orders.setState(ordersDto.getState());
      orders.setLatitude(ordersDto.getLatitude());
      orders.setLongitude(ordersDto.getLongitude());
        int rows=orderMapper.updateById(orders);

        if (rows == 0){
            return R.FAIL("失败");
        }
        return R.OK("成功");


    }

    /**
     * 确认收货
     *
     * @param oid
     * @return
     */
    @Override
    public R deleted(int oid) {
        Orders orders=new Orders();
        orders.setOid(oid);
        orders.setDeleted(1);
        int rows=orderMapper.updateById(orders);

        if (rows == 0){
            return R.FAIL("删除失败");
        }

        return R.OK("删除成功！！！");
    }



}

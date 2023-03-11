package com.demo.shopping.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.shopping.dto.CartDto;
import com.demo.shopping.dto.OrdersDto;
import com.demo.shopping.pojo.Cart;
import com.demo.shopping.pojo.Orders;

import java.util.List;

public interface OrderMapper extends BaseMapper<Orders> {
    List<Orders> querylistOrder(CartDto uid);
    List<Orders> querylistfu(CartDto uid);

    List<Orders> querylistzong(CartDto cartDto);

    List<Orders> querylistshangjia(int sid);
}

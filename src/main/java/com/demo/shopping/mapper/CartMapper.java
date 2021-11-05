package com.demo.shopping.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.shopping.dto.CartDto;
import com.demo.shopping.pojo.Cart;

import java.util.List;

public interface CartMapper extends BaseMapper<Cart> {
    List<Cart>querylistCart(CartDto uid);

}

package com.demo.shopping.service;

import com.demo.shopping.dto.CartDto;
import com.demo.shopping.dto.OrdersDto;
import com.demo.shopping.pojo.Cart;
import com.demo.shopping.vo.R;

public interface CartService {
    R list(CartDto cartDto);


    /**
     * 删除
     * @param cid
     * @return
     */
    R deleted(int cid);

    /**
     * 添加入购物车
     * @param cart
     * @return
     */
    R add(Cart cart);


    R save(CartDto cartDto);
}

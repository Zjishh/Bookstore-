package com.demo.shopping.controller;

import com.demo.shopping.dto.CartDto;
import com.demo.shopping.dto.OrdersDto;
import com.demo.shopping.pojo.Cart;
import com.demo.shopping.service.CartService;
import com.demo.shopping.service.OrderService;
import com.demo.shopping.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * projectName: health
 *
 * @author: 杨玉斌
 * time: 2021/11/4 13:38
 * description:购物车接口
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;
    @PostMapping("list")
    public Object list(@RequestBody CartDto cartDto){
        R r=cartService.list(cartDto);
        return r;

    }
    @GetMapping("deleted")
    public  Object deleted(int cid){
        R r =cartService.deleted(cid);
        return r;
    }


    @PostMapping("add")
    public Object add(@RequestBody Cart cart){
        R r=cartService.add(cart);
        return r;
    }

    @PostMapping("save")
    public Object save(@RequestBody CartDto cartDto){
        R r=cartService.save(cartDto);
        return r;
    }

}

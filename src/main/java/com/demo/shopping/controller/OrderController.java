package com.demo.shopping.controller;

import com.demo.shopping.dto.CartDto;
import com.demo.shopping.dto.OrdersDto;
import com.demo.shopping.pojo.Cart;
import com.demo.shopping.pojo.Orders;
import com.demo.shopping.service.OrderService;
import com.demo.shopping.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * projectName: health
 *
 * @author: 杨玉斌
 * time: 2021/11/4 20:36
 * description:订单接口的实现
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("list")
    public Object list(@RequestBody CartDto cartDto){
        R r=orderService.list(cartDto);
        return r;
    }
    @PostMapping("fa")
    public Object fa(@RequestBody CartDto cartDto){
        R r=orderService.fa(cartDto);
        return r;
    }
    @PostMapping("add")
    public Object add(@RequestBody Orders orders){
        R r=orderService.add(orders);
        return r;
    }

    @PostMapping("save")
    public  Object save(@RequestBody OrdersDto ordersDto){
        R r= orderService.save(ordersDto);
        return r;

    }


    @GetMapping("deleted")
    public  Object deleted(int oid){
        R r =orderService.deleted(oid);
        return r;
    }

    @PostMapping("zong")
    public Object zong(@RequestBody CartDto cartDto){
        R r=orderService.zong(cartDto);
        return r;
    }
    @PostMapping("shangjia")
    public Object shangjia(int sid){
        R r=orderService.shangjia(sid);
        return r;
    }
}

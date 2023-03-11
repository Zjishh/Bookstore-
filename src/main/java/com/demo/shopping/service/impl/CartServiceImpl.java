package com.demo.shopping.service.impl;


import com.demo.shopping.dto.CartDto;
import com.demo.shopping.mapper.CartMapper;
import com.demo.shopping.pojo.Cart;
import com.demo.shopping.service.CartService;
import com.demo.shopping.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartMapper cartMapper;
    @Override
    public R list(CartDto cartDto) {
        if (cartDto.getUid()!=null){
            List<Cart> carts = cartMapper.querylistCart(cartDto);
            return R.OK("成功",carts);

        }else {

            return R.OK("请先登录！！！");
        }
    }

    /**
     * 删除
     *
     * @param cid
     * @return
     */
    @Override
    public R deleted(int cid) {
        Cart cart=new Cart();
        cart.setCid(cid);
        cart.setDeleted(1);
        int rows=cartMapper.updateById(cart);

        if (rows == 0){
            return R.FAIL("删除失败");
        }
        return R.OK("删除成功！！！");
    }

    /**
     * 添加入购物车
     *
     * @param cart
     * @return
     */
    @Override
    public R add(Cart cart) {
        CartDto cartDto = new CartDto();
        cartDto.setUid(cart.getUid());
        cartDto.setBid(cart.getBid());
        List<Cart> carts = cartMapper.querylistCart(cartDto);

        if(!carts.isEmpty()){

            cart.setCid(carts.get(0).getCid());

            int rows=cartMapper.updateById(cart);

            if (rows == 0){
                return R.FAIL("购物车更新失败");
            }
            return R.OK("购物车更新成功");
        }else {
            int rows=0;
            try {
                rows=cartMapper.insert(cart);
            }catch (Exception e){}
            if(rows==0) {
                return R.FAIL("添加失败");
            }
            return R.OK("添加成功");
        }
    }


    public R save(CartDto cartDto) {
        Cart cart=new Cart();
        cart.setCid(cartDto.getCid());
        cart.setNum(cartDto.getNum());
        cart.setDeleted(1);
        int rows=cartMapper.updateById(cart);

        if (rows == 0){
            return R.FAIL("失败");
        }

        return R.OK("成功！！！");
    }

}

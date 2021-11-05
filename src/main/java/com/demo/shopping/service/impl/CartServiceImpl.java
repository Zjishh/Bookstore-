package com.demo.shopping.service.impl;

import com.demo.shopping.dto.CartDto;
import com.demo.shopping.mapper.CartMapper;
import com.demo.shopping.pojo.Cart;
import com.demo.shopping.service.CartService;
import com.demo.shopping.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: health
 *
 * @author: 杨玉斌
 * time: 2021/11/4 13:38
 * description:购物车服务的实现
 */
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
        int rows=0;
        try {
            rows=cartMapper.insert(cart);
        }catch (Exception e){}
        if(rows==0){
            return R.FAIL("修改失败");
        }
        return R.OK("成功");
    }


}

package com.demo.shopping.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.demo.shopping.dto.Store;
import com.demo.shopping.mapper.StoreMapper;


import com.demo.shopping.mapper.StoresMapper;
import com.demo.shopping.service.StoreService;
import com.demo.shopping.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StoreServiceimpl implements StoreService {
    @Autowired
    private StoresMapper storesMapper;
    @Override
    public R list(Store store) {
        QueryWrapper<Store> queryWrapper=new QueryWrapper<>();

        if(store.getUid()!=null){
            queryWrapper.eq("uid",store.getUid());
        }
        List<Store> stores=storesMapper.selectList(queryWrapper);
        return R.OK("查询成功",stores);
    }
}

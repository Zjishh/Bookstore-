package com.demo.shopping.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.demo.shopping.mapper.PictureMapper;
import com.demo.shopping.pojo.Book;
import com.demo.shopping.pojo.Picture;
import com.demo.shopping.service.PictureService;
import com.demo.shopping.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureServiceimpl implements PictureService {

@Autowired
    private PictureMapper pictureMapper;


    @Override
    public R add(Picture picture) {
        int rows=0;
        try {
            rows=pictureMapper.insert(picture);
        }catch ( Exception e){

        }
        if(rows==0){
            return R.FAIL("插入失败！");
        }
        return R.OK("插入成功！");


    }

    @Override
    public R list(Picture picture) {
        QueryWrapper<Picture> queryWrapper=new QueryWrapper<>();
        if (picture.getBid()!=null){
            queryWrapper.eq("bid",picture.getBid());
        }
        List<Picture> pictures=pictureMapper.selectList(queryWrapper);
        return R.OK("查询成功",pictures);
    }

    @Override
    public R delete(int bid) {
        int rows = 0;
        QueryWrapper<Picture> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("bid",bid);
        List<Picture> pictures = pictureMapper.selectList(queryWrapper);
        for (Picture picture : pictures){
            picture.setDeleted(1);
            rows=pictureMapper.updateById(picture);
        }


        if(rows==0){
            return R.FAIL("删除失败");
        }
        return R.OK("删除成功");

    }
}

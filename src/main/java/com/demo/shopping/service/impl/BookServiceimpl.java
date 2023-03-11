package com.demo.shopping.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.demo.shopping.dto.BookDto;
import com.demo.shopping.mapper.BookMapper;
import com.demo.shopping.mapper.PictureMapper;
import com.demo.shopping.pojo.Book;
import com.demo.shopping.pojo.Picture;
import com.demo.shopping.service.BookService;
import com.demo.shopping.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceimpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private PictureMapper pictureMapper;
    @Override
    public R list(BookDto bookDto) {
        List<Book> books=bookMapper.queryBooks(bookDto);
        return R.OK("查询成功",books);

    }
    @Override
    public R update(Book book) {
        int rows=0;
        try {
            rows=bookMapper.updateById(book);
        }catch (Exception e){

        }
        if(rows==0){
            return R.FAIL("修改失败");
        }

        return R.OK("修改成功",book);
    }
    @Override
    public R save(Book book) {
        int rows=0;
        try {
            rows=bookMapper.insert(book);
        }catch ( Exception e){

        }
        if(rows==0){
            return R.FAIL("插入图书失败！");
        }
        return R.OK("插入图书成功！",book.getBid());
    }

    @Override
    public R delete(int bid) {
        Book books=new Book();
        books.setBid(bid);
        books.setDeleted(1);
        int rows=bookMapper.updateById(books);
        if(rows==0){
            return R.FAIL("删除失败");
        }
        return R.OK("删除成功");
    }

    @Override
    public R listPicture(Integer bid) {
        QueryWrapper<Picture> queryWrapper = new QueryWrapper<>();
        if (bid!=null){
            queryWrapper.eq("bid",bid);
        }

        List<Picture> pictures = pictureMapper.selectList(queryWrapper);
        return R.OK("查询成功",pictures);
    }
/**
 * projectName: shopping
 * @author: 肖学桐
 * time: 2021/11/4 10:51
 * description:
 */


}

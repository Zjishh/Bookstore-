package com.demo.shopping.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.shopping.dto.BookDto;
import com.demo.shopping.pojo.Book;

import java.util.List;

public interface BookMapper extends BaseMapper<Book> {
    List<Book> queryBooks(BookDto bookDto);
}

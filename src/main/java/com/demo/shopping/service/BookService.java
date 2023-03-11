package com.demo.shopping.service;

import com.demo.shopping.dto.BookDto;
import com.demo.shopping.pojo.Book;
import com.demo.shopping.vo.R;

public interface BookService {
    R list(BookDto bookDto);
    R save(Book book);
    R delete(int bid);
    R update(Book book);
    R listPicture(Integer bid);
}

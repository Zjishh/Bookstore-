package com.demo.shopping.controller;

import com.demo.shopping.dto.BookDto;
import com.demo.shopping.pojo.Book;
import com.demo.shopping.service.BookService;
import com.demo.shopping.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/book")
public class BookController {
/**
 * projectName: shopping
 * @author: 肖学桐
 * time: 2021/11/4 9:48
 * description:
 */
@Autowired
    private BookService bookService;
@GetMapping("list")
    public Object list(BookDto bookDto){
    R r=bookService.list(bookDto);
    return r;
}
    @GetMapping("listPicture")
    public Object listPicture(Integer bid){
        R r=bookService.listPicture(bid);
        return r;
    }
@PostMapping("save")
    public Object save(@RequestBody Book book){
    R r=bookService.save(book);
    return r;
}
@GetMapping("delete")
    public Object delete(int bid){
    R r=bookService.delete(bid);
    return r;
}
    @PostMapping("update")
    public Object update(@RequestBody Book book){
        R r=bookService.update(book);
        return r;
    }
}

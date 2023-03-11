package com.demo.shopping.controller;

import com.demo.shopping.dto.Store;
import com.demo.shopping.service.StoreService;
import com.demo.shopping.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: health
 *
 * @author: 贾瑞超
 * time: 2021/11/9 13:50
 * description:
 */

@RestController
@CrossOrigin("*")
@RequestMapping("/store")
public class StoreController {
    @Autowired
    private StoreService storeService;
    @GetMapping("list")
    public Object list(Store store){
        R r=storeService.list(store);
        return r;
    }
}

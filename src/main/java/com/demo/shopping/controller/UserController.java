package com.demo.shopping.controller;

import com.demo.shopping.dto.UserDto;
import com.demo.shopping.pojo.User;
import com.demo.shopping.service.UserService;
import com.demo.shopping.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
    /**
     * projectName: shopping
     * @author: 肖学桐
     * time: 2021/11/3 15:29
     * description:
     */
    @Autowired
    private UserService userService;
    @PostMapping("login")
    public Object login(@RequestBody User user){
        R r=userService.login(user);

        return r;
    }
    @PostMapping("update")
    public Object update(@RequestBody User user){
        R r=userService.update(user);
        return r;
    }
    @GetMapping("list")
    public Object list(UserDto userDto){
        R r=userService.list(userDto);
        return r;
    }

}

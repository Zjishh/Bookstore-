package com.demo.shopping.service;

import com.demo.shopping.dto.UserDto;
import com.demo.shopping.pojo.User;
import com.demo.shopping.vo.R;

public interface UserService {
    R login(User user);
    R update(User user);
    R list(UserDto userDto);
}

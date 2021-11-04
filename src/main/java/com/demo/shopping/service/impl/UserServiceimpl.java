package com.demo.shopping.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.demo.shopping.mapper.UserMapper;
import com.demo.shopping.pojo.User;
import com.demo.shopping.service.UserService;
import com.demo.shopping.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {
/**
 * projectName: shopping
 * @author: 肖学桐
 * time: 2021/11/3 16:16
 * description:
 */
@Autowired
    private UserMapper userMapper;

    @Override
    public R login(User user) {
        if(user.getPhone()==null||user.getPhone()==""){
            return R.FAIL("账号不能为空！");
        }
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("phone",user.getPhone());
        User users=userMapper.selectOne(queryWrapper);
        if(users==null){
            return R.FAIL("账号错误");
        }
        if(!user.getPassword().equals(users.getPassword())){
            return R.FAIL("密码错误");
        }
        return R.OK("登录成功",users);
    }
}

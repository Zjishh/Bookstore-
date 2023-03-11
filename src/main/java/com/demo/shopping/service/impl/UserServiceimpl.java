package com.demo.shopping.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.demo.shopping.dto.UserDto;
import com.demo.shopping.mapper.UserMapper;
import com.demo.shopping.pojo.User;
import com.demo.shopping.service.UserService;
import com.demo.shopping.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {

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

        return R.OK("登录成功",users);
    }

    @Override
    public R update(User user) {
        int rows=0;
        try{
            rows=userMapper.updateById(user);

        }catch (Exception e){

        }
        if(rows==0){
            return R.FAIL("修改失败");
        }
        return R.OK("修改成功！");
    }



    @Override
    public R list(UserDto userDto) {
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();


        if(userDto.getUid() != null){
            queryWrapper.eq("uid",userDto.getUid());
        }
        if(userDto.getSid() != null){
            queryWrapper.eq("sid",userDto.getSid());
        }
        List<User> user2=userMapper.selectList(queryWrapper);
        return R.OK("查询成功",user2);

    }
}

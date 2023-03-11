package com.demo.shopping.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {

@TableId(type = IdType.AUTO)
private Integer uid;
private String imgsrc;
private String name;
private String phone;
private String password;
private String address;
private int type;

}

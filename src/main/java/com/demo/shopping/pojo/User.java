package com.demo.shopping.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {
/**
 * projectName: shopping
 * @author: 肖学桐
 * time: 2021/11/3 14:40
 * description:
 */
@TableId(type = IdType.AUTO)
private Integer uid;
private String imgsrc;
private String name;
private String phone;
private Integer password;
private String address;
private int type;

}

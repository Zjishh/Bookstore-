package com.demo.shopping.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;


@Data
public class Store {
    @TableId(type = IdType.AUTO)
    private Integer sid;
    private String sname;
    private Integer uid;
    private  Integer deleted;

    private User user;
}

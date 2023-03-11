package com.demo.shopping.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;


@Data
public class Orders {
    @TableId(type = IdType.AUTO)
    private Integer oid;
    private Integer uid;
    private Integer sid;
    private Integer bid;
    private Integer num;
    private Integer state;
    private double latitude;
    private double longitude;
    private Integer deleted;
    private Book book;
    private Store store;
    private Picture picture;
}

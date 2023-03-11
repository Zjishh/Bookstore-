package com.demo.shopping.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;


@Data
public class Cart {
    @TableId(type = IdType.AUTO)
    private Integer cid;
    private Integer uid;
    private Integer sid;
    private Integer bid;
    private Integer num;
    private Integer deleted;

    private Book book;
    private Store store;
}

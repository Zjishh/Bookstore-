package com.demo.shopping.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;


@Data
public class Book {
    @TableId(type = IdType.AUTO)
    private Integer bid;
    private Integer sid;
    private String bname;
    private double price;
    private double fare;
    private String title;
    private String genre;
    private Integer deleted;

    private Store store;
    private List<Picture> pictures;
}

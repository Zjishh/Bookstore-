package com.demo.shopping.pojo;

import lombok.Data;

/**
 * projectName: health
 *
 * @author: 杨玉斌
 * time: 2021/11/4 14:02
 * description:图书
 */
@Data
public class Book {
    private String img;
    private Integer bid;
    private Integer sid;
    private Integer pid;
    private String bname;
    private double price;
    private  Integer fare;
    private String title;
    private String genre;



}

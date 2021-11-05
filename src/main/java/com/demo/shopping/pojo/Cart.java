package com.demo.shopping.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * projectName: health
 *
 * @author: 杨玉斌
 * time: 2021/11/4 13:33
 * description:购物车
 */
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

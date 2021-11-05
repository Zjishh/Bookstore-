package com.demo.shopping.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * projectName: health
 *
 * @author: 杨玉斌
 * time: 2021/11/4 20:27
 * description:订单
 */
@Data
public class Orders {
    @TableId(type = IdType.AUTO)
    private Integer oid;
    private Integer uid;
    private Integer sid;
    private Integer bid;
    private Integer state;
    private double latitude;
    private double longitude;
    private Integer deleted;

    private Book book;
    private Store store;
}

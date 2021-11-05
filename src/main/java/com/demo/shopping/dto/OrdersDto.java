package com.demo.shopping.dto;

import lombok.Data;

/**
 * projectName: health
 *
 * @author: 杨玉斌
 * time: 2021/11/4 21:37
 * description:订单信息修改
 */
@Data
public class OrdersDto {
    private Integer oid;
    private Integer state;
    private double latitude;
    private double longitude;
}

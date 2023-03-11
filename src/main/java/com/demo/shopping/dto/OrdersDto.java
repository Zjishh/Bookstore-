package com.demo.shopping.dto;

import lombok.Data;


@Data
public class OrdersDto {
    private Integer oid;
    private Integer state;
    private double latitude;
    private double longitude;
}

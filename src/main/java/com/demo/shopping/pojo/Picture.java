package com.demo.shopping.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Picture {

  @TableId(type = IdType.AUTO)
  private Integer pid;
  private Integer bid;
  private String url;
  private Integer deleted;
}

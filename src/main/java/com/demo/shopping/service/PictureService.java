package com.demo.shopping.service;

import com.demo.shopping.pojo.Picture;
import com.demo.shopping.vo.R;

public interface PictureService {
    R add(Picture picture);
    R list(Picture picture);
    R delete(int bid);
}

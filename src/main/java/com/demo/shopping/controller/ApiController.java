package com.demo.shopping.controller;

import com.demo.shopping.dto.FileName;
import com.demo.shopping.vo.R;
import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * projectName: health
 *
 * @author: 王正国
 * time: 2021/11/5 17:45
 * description:
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping(value = "/sampleSearch", produces = "application/json")
    public R wxSubject(HttpServletRequest request, @RequestParam("file") MultipartFile files) {

        // 构建上传目录路径
        String uploadPath = System.getProperty("user.dir")+"/src/main/resources/static/images";
        String uploadPath2 = System.getProperty("user.dir")+"/target/classes/static/images";
        // 如果目录不存在就创建
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }

        // 获取文件名称
        String fileName = files.getOriginalFilename();
        // 构建文件路径
        String filePath = uploadPath + "/" + fileName;
        String filePath2 = uploadPath2 + "/" + fileName;
        // 保存文件
        try {
            FileUtils.writeByteArrayToFile(new File(filePath),files.getBytes());
            FileUtils.writeByteArrayToFile(new File(filePath2),files.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }

        FileName fileNames = new FileName();
        fileNames.setFileName(fileName);
        fileNames.setFileUrl("http://localhost:8080/shopping/static/images/"+fileName);
        return R.OK("接收文件成功",fileNames);
    }

}

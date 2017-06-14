package com.tool.common.fileuploader.validate;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author alex-jiayu
 * @create 2017-06-14 16:17
 **/
public interface IMD5 {

    String md5(File file);
    String md5(MultipartFile file);
}

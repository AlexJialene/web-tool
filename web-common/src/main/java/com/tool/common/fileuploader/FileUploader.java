package com.tool.common.fileuploader;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author alex-jiayu
 * @create 2017-06-13 16:26
 **/
public interface FileUploader {

    void upload(MultipartFile file);

    void upload(File file);

}

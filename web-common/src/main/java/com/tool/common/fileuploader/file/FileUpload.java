package com.tool.common.fileuploader.file;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author alex-jiayu
 * @create 2017-06-14 11:36
 **/
public interface FileUpload extends IC{

    String upload(File file);
    String upload(MultipartFile file);
    String upload(File file , int chunks , int chunk);
    String upload(MultipartFile file , int chunks , int chunk);
}

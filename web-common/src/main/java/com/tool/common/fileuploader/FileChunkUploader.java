package com.tool.common.fileuploader;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author alex-jiayu
 * @create 2017-06-13 18:25
 **/
public interface FileChunkUploader {

    void upload(MultipartFile file , int chunks , int chunk);
}

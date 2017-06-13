package com.tool.common.fileuploader;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author alex-jiayu
 * @create 2017-06-13 18:46
 **/
public class FileChunkUpload implements FileChunkUploader{
    @Override
    public void upload(MultipartFile file, int chunks, int chunk) {

    }
}

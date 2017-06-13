package com.tool.common.fileuploader;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author alex-jiayu
 * @create 2017-06-13 16:41
 **/
public class FileUpload implements FileUploader {
    private UploadType type;
    private String outputPath;

    public FileUpload(String path, UploadType uploadType) {
        this.outputPath = path;
        this.type = uploadType;
    }

    @Override
    public void upload(MultipartFile file) {

    }

    @Override
    public void upload(File file) {

    }


}

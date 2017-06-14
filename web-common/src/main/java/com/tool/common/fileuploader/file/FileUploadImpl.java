package com.tool.common.fileuploader.file;


import com.tool.common.fileuploader.validate.Validate;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUploadImpl implements FileUpload , Validate{
    private Logger logger = LoggerFactory.getLogger(FileUploadImpl.class);
    private Validate validate ;
    private String path;
    private String fileName;

    public FileUploadImpl(Validate validate) {
        this.validate = validate;
    }


    @Override
    public boolean validate() {
        return validate.validate();
    }


    @Override
    public String upload(File file) {
        return null;
    }

    @Override
    public String upload(MultipartFile file) {
        return null;
    }

    @Override
    public String upload(File file, int chunks, int chunk) {
        return null;
    }

    @Override
    public String upload(MultipartFile file, int chunks, int chunk) {
        return null;
    }


    @Override
    public void outPath(String path) {
        this.path = path;
    }

    @Override
    public void fileName(String name) {
        this.fileName = name;
    }
}

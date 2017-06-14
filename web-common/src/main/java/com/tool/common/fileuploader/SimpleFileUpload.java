package com.tool.common.fileuploader;

import com.tool.common.fileuploader.file.FileUpload;
import com.tool.common.fileuploader.file.FileUploadImpl;
import com.tool.common.fileuploader.file.IC;
import com.tool.common.fileuploader.validate.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author alex-jiayu
 * @create 2017-06-14 11:33
 **/
public class SimpleFileUpload implements FileUpload , IMD5{
    private FileUpload fileUpload;
    private IMD5 imd5;
    private IC ic;

    public static SimpleFileUpload init(VerifierType.Type type ){
        return init(type , false , false);
    }

    public static SimpleFileUpload init(VerifierType.Type type , boolean md5 , boolean mime){
        return init(VerifierFactory.initValidate(type , md5 , mime) );
    }

    public static SimpleFileUpload init(Verifier validate ){
        return new SimpleFileUpload(new FileUploadImpl(validate) , validate);
    }


    private SimpleFileUpload(FileUpload fileUpload , IMD5 verifier) {
        this.fileUpload = fileUpload;
        this.imd5 = verifier;
    }



    public String upload(File file) {
        return fileUpload.upload(file);
    }

    public String upload(MultipartFile file) {
        return fileUpload.upload(file);
    }

    public String upload(File file, int chunks, int chunk) {
        return fileUpload.upload(file , chunks , chunk);
    }

    public String upload(MultipartFile file, int chunks, int chunk) {
        return fileUpload.upload(file , chunks , chunk);
    }

    @Override
    public String md5(File file) {
        return imd5.md5(file);
    }

    @Override
    public String md5(MultipartFile file) {
        return imd5.md5(file);
    }

    @Override
    public void outPath(String path) {
        fileUpload.outPath(path);
    }

    @Override
    public void fileName(String name) {
        fileUpload.fileName(name);
    }
}

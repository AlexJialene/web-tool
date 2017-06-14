package com.tool.common.fileuploader.validate;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author alex-jiayu
 * @create 2017-06-14 11:48
 **/
public class Verifier implements Validate , IMD5{
    private VerifierType.Type type;
    private VerifierType.Mime mime;

    protected boolean vmd5 = false;
    protected boolean vmime = false;

    protected Verifier(VerifierType.Type type, VerifierType.Mime mime) {
        this.type = type;
        this.mime = mime;
    }

    @Override
    public final String md5(File file) {
        return null;
    }

    @Override
    public final String md5(MultipartFile file) {
        return null;
    }

    @Override
    public boolean validate() {
        return false;
    }





}

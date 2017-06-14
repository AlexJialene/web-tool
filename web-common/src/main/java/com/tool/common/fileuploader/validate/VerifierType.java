package com.tool.common.fileuploader.validate;

/**
 * @author alex-jiayu
 * @create 2017-06-14 11:57
 **/
public class VerifierType {

    public enum Type{
        PDF("pdf"),
        PIC("jpg,png,jpeg,gif,bmp");



        private String type;
        Type(String s) {
            this.type = s;
        }
        public String type(){
            return this.type;
        }
    }

    public enum Mime{
        application_pdf
    }
}

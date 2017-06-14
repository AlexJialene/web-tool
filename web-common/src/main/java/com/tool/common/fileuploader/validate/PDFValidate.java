package com.tool.common.fileuploader.validate;

/**
 * @author alex-jiayu
 * @create 2017-06-14 12:00
 **/
public class PDFValidate extends Verifier{

    public PDFValidate(VerifierType.Type type, VerifierType.Mime mime) {
        super(type, mime);
    }

    public void setMd5(boolean md5){
        super.vmd5 = md5;
    }

    public void setMime(boolean mime){
        super.vmime = mime;
    }


    @Override
    public boolean validate() {

        return super.validate();
    }
}

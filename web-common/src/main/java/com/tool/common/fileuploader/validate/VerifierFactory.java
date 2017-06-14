package com.tool.common.fileuploader.validate;

import static com.tool.common.fileuploader.validate.VerifierType.Type.*;
import static com.tool.common.fileuploader.validate.VerifierType.Mime.*;

/**
 * @author alex-jiayu
 * @create 2017-06-14 15:28
 **/
public class VerifierFactory {


    public static Verifier initValidate(VerifierType.Type type , boolean md5 , boolean mime){
        switch (type){
            case PDF :
                Verifier p = new Verifier(type , application_pdf);
                p.vmd5 = md5;
                p.vmime = mime;
                return p;
        }

        return null;
    }
}

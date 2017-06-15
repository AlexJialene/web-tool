package com.tool.controller;

import com.tool.common.fileuploader.util.FileByteUtil;
import com.tool.controller.base.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@RequestMapping("/pdf")
public class PDFController extends BaseController{

    private Logger logger = LoggerFactory.getLogger(PDFController.class);

    @RequestMapping("/fileUpload")
    public Object pdfUpload(@RequestParam("file")MultipartFile file){

        System.out.println(UPLOAD_PATH);
        /*try {
            FileByteUtil.byte2File(file.getBytes() , UPLOAD_PATH, "test1.jpg");

        } catch (IOException e) {
            e.printStackTrace();
        }
*/

        return "";
    }

}

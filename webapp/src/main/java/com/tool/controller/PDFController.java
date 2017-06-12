package com.tool.controller;

import com.tool.controller.base.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/pdf")
public class PDFController extends BaseController{


    @RequestMapping("/fileUpload")
    public Object pdfUpload(@RequestParam("file")MultipartFile file){

        return null;
    }

}

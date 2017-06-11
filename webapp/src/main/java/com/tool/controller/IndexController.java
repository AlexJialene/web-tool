package com.tool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Alex_ on 2017/6/11.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model){
        return "index";
    }
}

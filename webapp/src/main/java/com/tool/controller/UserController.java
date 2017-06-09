package com.tool.controller;


import com.tool.base.BaseController;
import com.tool.domain.User;
import com.tool.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

    //@Autowired
    private UserService userService;


    @RequestMapping("/selectUser")
    public String selectUser(Model model){
        User u = userService.test();
        System.out.println(u);

        model.addAttribute("name" , u.getName());
        return "index";
    }


    @RequestMapping("/getUser")
    @ResponseBody
    public Object user(){

        new Exception();
        //return user;
        return 12/0;
    }

    @RequestMapping("/admin")
    public String index2(){

        return "index";
    }


    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name" , "alex");
        return "/index";
    }

}

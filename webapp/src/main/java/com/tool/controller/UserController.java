package com.tool.controller;


import com.github.pagehelper.PageInfo;
import com.tool.common.vo.ResultVo;
import com.tool.controller.base.BaseController;
import com.tool.domain.User;
import com.tool.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

    @Autowired
    private UserService userService;


    @RequestMapping("/selectUser")
    public String selectUser(Model model){
        User u = userService.test();
        //System.out.println(u);

        model.addAttribute("name" , u.getName());
        return "index";
    }

    @RequestMapping("/selectUserPage")
    public String selectUserPage(Model m){
        List<User> userList = userService.selectUsers();
        m.addAttribute("pageInfo" , new PageInfo<>(userList));
        m.addAttribute("name" , null);
        return "index";
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public Object user(){

        resultVo.setHttpResCode(200);
        resultVo.setHttpResCode(1);

        return resultVo;
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

package com.tool.common.servlet;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * Created by Alex_ on 2017/6/10.
 */

@WebServlet(urlPatterns = "/druid/*" , initParams = {
        @WebInitParam(name="loginUserName" , value="system"),
        @WebInitParam(name="loginPassword" , value="123456")
})
public class DruidServlet extends StatViewServlet {


}

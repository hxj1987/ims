package com.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.api.model.UserModel;
import com.api.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.*;

@Controller
@RequestMapping("user")
public class UserController extends BaseController {

    @Reference(version = "1.0.0")
    private IUserService iUserService;

    @RequestMapping("/toTestPage")
    public String toTestPage(){
        System.out.println("this is test page!");
        return "test";
    }
    @RequestMapping("/toUserPage")
    public String toUserPage(){
        System.out.println("this is test page!");
        return "user/userList";
    }
    @RequestMapping("/getUserList")
    @ResponseBody
    public void getUserList(HttpServletResponse response){
        Map<String,Object> map = new HashMap<String, Object>();
        List<UserModel> list = iUserService.getUserList(map);
        this.getReturnMapStr("200","查询成功",list,response);
    }

    @RequestMapping("/login")
    public String login(HttpServletResponse response){

        return "login/login";
    }
    @RequestMapping("/userLogin")
    public String userLogin(HttpServletResponse response){

        return "index";
    }

    @RequestMapping("/main")
    public String main(HttpServletResponse response){

        return "main";
    }

    @RequestMapping("/changePwd")
    public String changePwd(HttpServletResponse response){

        return "user/changePwd";
    }
}

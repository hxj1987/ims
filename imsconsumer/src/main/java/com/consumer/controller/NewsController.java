package com.consumer.controller;

import com.api.model.UserModel;
import com.api.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("news")
public class NewsController extends BaseController {

    @RequestMapping("/newsList")
    public String newsList(HttpServletResponse response){

        return "news/newsList";
    }
}

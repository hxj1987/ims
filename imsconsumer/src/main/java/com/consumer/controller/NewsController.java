package com.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("news")
public class NewsController extends BaseController {

    @RequestMapping("/newsList")
    public String newsList(HttpServletResponse response){

        return "news/newsList";
    }
}

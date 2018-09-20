package com.blog.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/layui/index")
    public String index(){
        return "layui/index";
    }
    @RequestMapping("/index")
    public String index1(){
        return "index";
    }
}

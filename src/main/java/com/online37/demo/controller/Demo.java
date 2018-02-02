package com.online37.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Demo {
    @ResponseBody
    @RequestMapping("/")
    public String index(){
        return "index.jsp";
    }
}

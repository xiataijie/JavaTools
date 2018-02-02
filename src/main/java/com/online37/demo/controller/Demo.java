package com.online37.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Demo {


    @ResponseBody
    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index");
    }


}

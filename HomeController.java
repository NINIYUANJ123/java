package com.travel.bootmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Auther: yjw
 * @Date: 2020/03/16/17:01
 * @Description:  首页
 */
@Controller
@RequestMapping("/Home")
public class HomeController {
    @RequestMapping
    public String web(){
        return "home";
    }
}

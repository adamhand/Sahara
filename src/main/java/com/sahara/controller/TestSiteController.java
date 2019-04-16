package com.sahara.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestSiteController {
    @RequestMapping(value = "/index", produces = {"application/json;charset=UTF-8"})
    public String index(){
        return "site/index";
    }

    @RequestMapping(value = "/about", produces = {"application/json;charset=UTF-8"})
    public String about(){
        return "site/about";
    }

    @RequestMapping(value = "/contact", produces = {"application/json;charset=UTF-8"})
    public String contact(){
        return "site/contact";
    }

    @RequestMapping(value = "/post", produces = {"application/json;charset=UTF-8"})
    public String post(){
        return "site/post";
    }
}

package com.sahara.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {
    @RequestMapping(value="/index", produces = {"application/json;charset=UTF-8"})
    public String index(){
        return "post";
    }
}

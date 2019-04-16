package com.sahara.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class TestAdminController {
    @RequestMapping(value = "/index", produces = {"application/json;charset=UTF-8"})
    public String adminIndex(){
        return "admin/index";
    }

    @RequestMapping(value = "/login", produces = {"application/json;charset=UTF-8"})
    public String adminLogin(){
        return "admin/login";
    }
}

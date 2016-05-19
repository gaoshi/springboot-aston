package com.wz.boot.aston.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wenzeng
 * @since 1.0
 */
@Controller
public class DashboardController {

    @RequestMapping({"/dashboard", "/index", "/main", "/"})
    public String dashboard() {
        return "dashboard";
    }

    @RequestMapping({"/icon"})
    public String icon() {
        return "icon";
    }

    @RequestMapping({"success"})
    @ResponseBody
    public Object json() {
        return "success";
    }

    @RequestMapping("save")
    public void save(){

    }
}


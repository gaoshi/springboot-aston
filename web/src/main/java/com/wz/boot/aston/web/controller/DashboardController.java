package com.wz.boot.aston.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wenzeng
 * @since 1.0
 */
@Controller
public class DashboardController {

    @RequestMapping({"/dashboard", "/main", "/"})
    public String dashboard() {
        return "dashboard";
    }

    @RequestMapping("dict")
    public void dict(ModelMap modelMap) {

    }
}


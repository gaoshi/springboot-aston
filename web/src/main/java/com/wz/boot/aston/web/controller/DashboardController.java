package com.wz.boot.aston.web.controller;

import com.alibaba.fastjson.JSON;
import com.wz.boot.aston.domain.entity.BaseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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

    @RequestMapping("form")
    public void form(ModelMap modelMap) {

    }

    @RequestMapping("save")
    @ResponseBody
    public Object save(BaseEntity entity) {
        System.out.println("BaseEntity:"+JSON.toJSONString(entity));
        return "OK";
    }
}


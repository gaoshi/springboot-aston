package com.wz.boot.aston.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wenzeng
 * @since 1.0
 */
@Controller
public class ExampleController {

    @RequestMapping("/")
    @ResponseBody
    public Object json() {
        return "Success";
    }
}

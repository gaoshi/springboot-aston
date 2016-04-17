package com.wz.boot.aston.web.controller;

import com.google.common.collect.ImmutableMap;
import org.apache.http.protocol.HTTP;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wenzeng
 * @since 1.0
 */
@RestController
public class RestfulExampleController {

    private static final String _userAgent = "userAgent";

    @RequestMapping("/restful")
    public Object json(HttpServletRequest request) {
        String userAgent = request.getHeader(HTTP.USER_AGENT);
        return ImmutableMap.of(_userAgent, userAgent);
    }
}

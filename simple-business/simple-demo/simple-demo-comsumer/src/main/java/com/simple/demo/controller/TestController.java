package com.simple.demo.controller;

import com.simple.demo.api.UserDubboService;
import com.simple.demo.api.TestDubboService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhangwei
 * @date : 2023/9/5
 */
@RequestMapping("test")
@RestController
public class TestController {

    @DubboReference
    private TestDubboService testDubboService;
    @DubboReference
    private UserDubboService userDubboService;

    @GetMapping("test")
    public String get1() {
        return testDubboService.test();
    }
    @GetMapping("user")
    public String user() {
        return userDubboService.user();
    }
}

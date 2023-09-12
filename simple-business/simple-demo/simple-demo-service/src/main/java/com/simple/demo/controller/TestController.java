package com.simple.demo.controller;

import org.springframework.beans.factory.annotation.Value;
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

    @Value("${test}")
    private String test;
    @GetMapping("get")
    public String get() {
        return test;
    }
}

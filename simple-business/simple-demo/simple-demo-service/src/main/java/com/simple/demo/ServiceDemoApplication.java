package com.simple.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : zhangwei
 * @date : 2023/9/5
 */
@SpringBootApplication(scanBasePackages = "com.simple")
public class ServiceDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceDemoApplication.class, args);
    }
}

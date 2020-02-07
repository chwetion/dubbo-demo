package com.foxmail.chwetion.dubbo.consumer.controller;

import com.foxmail.chwetion.dubbo.api.DemoApi;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Reference
    private DemoApi demoApi;

    @GetMapping("/hello")
    public String hello() {
        return demoApi.sayHello();
    }
}

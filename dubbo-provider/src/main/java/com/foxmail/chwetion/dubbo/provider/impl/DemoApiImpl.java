package com.foxmail.chwetion.dubbo.provider.impl;

import com.foxmail.chwetion.dubbo.api.DemoApi;
import org.apache.dubbo.config.annotation.Service;

@Service
public class DemoApiImpl implements DemoApi {
    @Override
    public String sayHello() {
        return "hello, world";
    }
}

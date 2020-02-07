package com.foxmail.chwetion.dubbo.provider.config;

import com.foxmail.chwetion.dubbo.provider.interceptor.HealthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {

    @Autowired
    private HealthInterceptor healthInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(healthInterceptor).addPathPatterns("/**");
    }
}

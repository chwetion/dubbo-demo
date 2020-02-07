package com.foxmail.chwetion.dubbo.provider.controller;

import com.foxmail.chwetion.dubbo.provider.context.RuntimeContext;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/health")
public class HealthController {

    private static List list = new ArrayList();

    @GetMapping
    @ResponseBody
    public String healthz() {
        return "health";
    }

    @ResponseBody
    @PostMapping("/{status}")
    public String setHealth(@PathVariable boolean status) {
        RuntimeContext.setHealth(status);
        return "set health status to " + status;
    }
}

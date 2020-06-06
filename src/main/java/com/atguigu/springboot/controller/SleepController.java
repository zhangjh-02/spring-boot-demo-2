package com.atguigu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SleepController {

    @RequestMapping("/sleep")
    public String sleep() {
        return "Sleep";
    }
}

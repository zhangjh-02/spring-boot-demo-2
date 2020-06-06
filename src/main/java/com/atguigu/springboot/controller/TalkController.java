package com.atguigu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TalkController {

    @RequestMapping("/talk")
    public String talk() {
        return "Talk";
    }
}

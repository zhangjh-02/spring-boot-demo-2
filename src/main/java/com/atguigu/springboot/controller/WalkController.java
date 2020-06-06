package com.atguigu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalkController {

    @RequestMapping("/walk")
    public String walk() {
        return "Walk";
    }
}

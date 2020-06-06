package com.atguigu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FightController {

    @RequestMapping("/fight")
    public String fight() {
        return "Fight";
    }
}

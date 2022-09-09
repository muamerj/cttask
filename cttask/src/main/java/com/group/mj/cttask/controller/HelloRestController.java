package com.group.mj.cttask.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloRestController {

    @GetMapping ("/hello-rest")

    public String HelloRest () {
        return "Hello World";
    }

}

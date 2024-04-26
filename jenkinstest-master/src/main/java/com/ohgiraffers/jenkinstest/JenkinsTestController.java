package com.ohgiraffers.jenkinstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsTestController {

    @GetMapping("/test")
    public String test() {
        return "hello";
    }

    @GetMapping("/test2")
    public String test2() {
        return "world";
    }
}

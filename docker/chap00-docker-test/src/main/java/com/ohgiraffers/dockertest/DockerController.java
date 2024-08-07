package com.ohgiraffers.dockertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @GetMapping("/test")
    public String test() {
        return "hello-world";
    }
}

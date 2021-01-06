package com.github.spring.boot.arthas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 石少东
 * @date create in 2021/1/3 6:47 下午
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "12345366636 \n";
    }


}

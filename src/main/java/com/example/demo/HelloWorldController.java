package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author jim
 * @Date 2021/4/22
 **/
@RestController
public class HelloWorldController {

    /**
     *
     * @return
     */
    @RequestMapping("/hello")
    public String hello(){
        return "Hello!Spring Boot!";
    }
}

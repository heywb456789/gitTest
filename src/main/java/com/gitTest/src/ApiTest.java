package com.gitTest.src;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTest {
    
    @GetMapping
    @RequestMapping("/hi")
    public String getMethod(){
        //log1
        return "hi";
    }
}

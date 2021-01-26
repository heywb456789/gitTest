package com.gitTest.src;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTest {
    
    @GetMapping
    @RequestMapping("/hi")
    public String getMethod(){
        return "hi";
    }

    @GetMapping
    @RequestMapping("/hi2")
    public String getMethod2(){
        return "hi";
    }

    @GetMapping
    @RequestMapping("/hi3")
    public String getMethod3(){
        return "hi";
    }

}

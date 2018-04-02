package com.aspect.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AspectController {

    @GetMapping("/test")
    public String sayHello(@RequestParam(name="name") String name){
        return "hello "+name;
    }
}


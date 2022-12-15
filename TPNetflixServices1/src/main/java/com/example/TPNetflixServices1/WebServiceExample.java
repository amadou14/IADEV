package com.example.TPNetflixServices1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServiceExample {
    @GetMapping("/")
    public String hello(){
        return "hello";
    }
}
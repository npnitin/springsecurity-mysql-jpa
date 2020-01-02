package com.example.springsecurityjpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home(){
        return "This is open endpoint!!";
    }

    @GetMapping("/user")
    public String user(){
        return "Only users can access this endpoint!!";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Only admin can access this endpoint!!";
    }
}

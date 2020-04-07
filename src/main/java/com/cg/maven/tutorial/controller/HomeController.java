package com.cg.maven.tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //DEMO CONFIG spring mvc +thymeleaf done
    @GetMapping("/demo")
    public String demo(){
        return  "demo";
    }
}

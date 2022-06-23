package com.example.secsectionthree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecController {

@GetMapping("/myaccount")
    public String getMyAccount(){
    return "my account";
}
}

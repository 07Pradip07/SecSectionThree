package com.example.secsectionthree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.secsectionthree.model","com.example.secsectionthree.config","com.example.secsectionthree.controller","com.example.secsectionthree.repository"})
public class SecsectionthreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecsectionthreeApplication.class, args);
    }

}

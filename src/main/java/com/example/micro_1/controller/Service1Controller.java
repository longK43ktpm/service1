package com.example.micro_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class Service1Controller {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/service_1")
    public String[] getAll(){
        return restTemplate.getForObject("", String[].class);
    }

}

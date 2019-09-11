package com.ns.eurekaclientone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/client1")
public class ClientOneController {

    @Value("${instance}")
    private String instance;

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + ", This message comes from client1-" + instance + "; " + new Date();
    }

}

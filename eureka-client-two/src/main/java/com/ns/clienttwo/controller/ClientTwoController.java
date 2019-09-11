package com.ns.clienttwo.controller;

import com.ns.clienttwo.service.IClientTwoFeignService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping("/client2")
public class ClientTwoController {

    @Value("${instance}")
    private String instance;

    @Resource
    private IClientTwoFeignService clientTwoFeignService;

    @GetMapping("")
    public String sayHi(@RequestParam String name) {
        return clientTwoFeignService.sayHiFromClientOne(name);
    }

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + ", This message comes from client2-" + instance + "; " + new Date();
    }

}

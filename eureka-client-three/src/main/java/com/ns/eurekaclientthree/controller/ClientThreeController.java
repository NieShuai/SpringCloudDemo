package com.ns.eurekaclientthree.controller;

import com.ns.eurekaclientthree.service.IClientThreeFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/client3")
public class ClientThreeController {

    @Resource
    private IClientThreeFeignService clientThreeFeignService;

    @GetMapping("")
    public String sayHi(@RequestParam String name) {
        return clientThreeFeignService.sayHiFromClientTwo(name);
    }

    @GetMapping("/sayHiFromClientTOne")
    public String sayHiFromClientTOne(@RequestParam String name) {
        return clientThreeFeignService.sayHiFromClientTOne(name);
    }

}

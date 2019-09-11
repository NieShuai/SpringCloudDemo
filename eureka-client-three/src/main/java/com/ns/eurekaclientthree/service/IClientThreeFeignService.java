package com.ns.eurekaclientthree.service;

import com.ns.eurekaclientthree.service.hystrix.ClientThreeFeignServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-two", fallback = ClientThreeFeignServiceHystrix.class)
public interface IClientThreeFeignService {

    @GetMapping("/client2/sayHello")
    String sayHiFromClientTwo(@RequestParam(value = "name") String name);

    @GetMapping("/client2")
    String sayHiFromClientTOne(@RequestParam(value = "name") String name);

}

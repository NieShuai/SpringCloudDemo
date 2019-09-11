package com.ns.clienttwo.service;

import com.ns.clienttwo.service.hystrix.ClientTwoFeignServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-one", fallback = ClientTwoFeignServiceHystrix.class)
public interface IClientTwoFeignService {

    @GetMapping("/client1/sayHello")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}

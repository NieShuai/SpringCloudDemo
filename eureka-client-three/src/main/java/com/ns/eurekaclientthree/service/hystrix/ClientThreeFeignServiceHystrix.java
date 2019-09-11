package com.ns.eurekaclientthree.service.hystrix;

import com.ns.eurekaclientthree.service.IClientThreeFeignService;
import org.springframework.stereotype.Component;

@Component
public class ClientThreeFeignServiceHystrix implements IClientThreeFeignService {

    @Override
    public String sayHiFromClientTwo(String name) {
        return "default value client2";
    }

    @Override
    public String sayHiFromClientTOne(String name) {
        return "default value client2";
    }
}

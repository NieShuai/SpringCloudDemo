package com.ns.clienttwo.service.hystrix;

import com.ns.clienttwo.service.IClientTwoFeignService;
import org.springframework.stereotype.Component;

@Component
public class ClientTwoFeignServiceHystrix implements IClientTwoFeignService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "default value";
    }
}

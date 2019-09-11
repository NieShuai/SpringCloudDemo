package com.ns.simplezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Description: 网关服务
 * http://ZUUL_HOST:ZUUL_PORT/serviceName/**
 * @Date: 2019/9/11
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class SimpleZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleZuulApplication.class, args);
    }

}

package com.ns.eurekaclientone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description: 生产者
 * @Date: 2019/9/11
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientOneApplication.class, args);
    }

}

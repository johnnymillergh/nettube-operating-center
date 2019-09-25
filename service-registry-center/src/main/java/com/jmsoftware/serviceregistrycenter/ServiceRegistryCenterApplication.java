package com.jmsoftware.serviceregistrycenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <h1>ServiceRegistryCenterApplication</h1>
 * <p>
 * Change description here.
 *
 * @author Johnny Miller (锺俊), email: johnnysviva@outlook.com
 * @date 9/25/19 2:17 PM
 **/
@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistryCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryCenterApplication.class, args);
    }
}

package com.haojie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：单击开始
 * @description：
 * @date ：Created in 2019/11/13 23:20
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistryServer {
    public static void main(String[] args) {
        SpringApplication.run(RegistryServer.class,args);
    }
}

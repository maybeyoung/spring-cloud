package com.example.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Administrator on 2017/10/11 0011.
 */
@SpringBootApplication
@EnableEurekaServer

public class Eureka_haApplication {
  //高可用
    public static void main(String[] args){
        SpringApplication.run(Eureka_haApplication.class,args);
    }
}

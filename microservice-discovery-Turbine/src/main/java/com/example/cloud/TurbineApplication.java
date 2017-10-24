package com.example.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;


/**
 * Created by Administrator on 2017/10/11 0011.
 */
@SpringBootApplication
@EnableTurbine
public class TurbineApplication {

    public static void main(String[] args){
        SpringApplication.run(TurbineApplication.class,args);
    }
}

package com.example.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/**
 * Created by Administrator on 2017/10/11 0011.
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DashboardApplication {

    public static void main(String[] args){
        SpringApplication.run(DashboardApplication.class,args);
    }
}

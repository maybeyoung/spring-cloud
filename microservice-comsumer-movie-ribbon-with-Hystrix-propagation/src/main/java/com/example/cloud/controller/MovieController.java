package com.example.cloud.controller;

import com.example.cloud.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;


/**
 * Created by Administrator on 2017/10/11 0011.
 */
@RestController
public class MovieController {

     @Autowired
    private RestTemplate restTemplate;

     @GetMapping("/movie/{id}")
     @HystrixCommand(fallbackMethod = "findByidFallback")
    public User findByisId(@PathVariable Long id){
       return this.restTemplate.getForObject("http://microservice-provider-user/simple/"+id,User.class);
    }

    public User findByidFallback(Long id){
        User user = new User();
        user.setId(0L);
        return user;
    }




}

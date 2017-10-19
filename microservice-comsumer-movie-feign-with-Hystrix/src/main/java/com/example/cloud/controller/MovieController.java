package com.example.cloud.controller;

import com.example.cloud.feign.UserFeignClient;
import com.example.cloud.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Administrator on 2017/10/11 0011.
 */
@RestController
public class MovieController {
     @Autowired
    private UserFeignClient userFeignClient;

     @GetMapping("/movie/{id}")
    public User findByisId(@PathVariable Long id){
       return userFeignClient.findById(id);
    }

}

package com.example.cloud.controller;

import com.example.cloud.entity.User;
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
    public User findByisId(@PathVariable Long id){
       return this.restTemplate.getForObject("http://microservice-provider-user/simple/"+id,User.class);
    }

    @GetMapping("/list-all")
   public List<User> listALL(){
        //这是错误的
        //List list = this.restTemplate.getForObject("http://microservice-provider-user/list-all", List.class);
        //正确的
        User[] users = this.restTemplate.getForObject("http://microservice-provider-user/list-all", User[].class);
        List<User> list = Arrays.asList(users);
        return list;
    }
}

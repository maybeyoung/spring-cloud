package com.example.cloud.controller;

import com.example.cloud.entity.User;
import com.example.cloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/10/11 0011.
 */
@RestController
public class UserController {

     @Autowired
    private UserRepository userRepository;

      @GetMapping("/simple/{id}")
     public User findById(@PathVariable Long id){
         return  this.userRepository.findOne(id);
     }

}

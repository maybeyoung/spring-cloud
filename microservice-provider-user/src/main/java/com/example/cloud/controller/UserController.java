package com.example.cloud.controller;

import com.example.cloud.entity.User;
import com.example.cloud.repository.UserRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

     @GetMapping("/list-all")
    public List<User> listAll(){
         ArrayList<User> list = Lists.newArrayList();
          User user1 = new User(1L,"李四");
         User user2 = new User(1L,"刘三");
         User user3 = new User(1L,"张武");
         list.add(user1);
         list.add(user2);
         list.add(user3);
         return list;
     }

}

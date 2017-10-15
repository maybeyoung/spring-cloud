package com.example.cloud.feign;

import com.example.cloud.entity.User;
import com.example.config.Feign3Configuration;
import org.springframework.cloud.netflix.feign.FeignClient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/10/13 0013.
 */
@FeignClient(name="microservice-provider-user",configuration = Feign3Configuration.class)
public interface UserFeignClient {
    //三个坑 1.@GetMapping不支持 2.@PathVariable得设置value
    // 3.只要参数是复杂对象，即使制定了GET方法，feign依然会以POST方法进行发送请求
   @RequestMapping(value = "/simple/{id}",method = RequestMethod.GET)
   public User findById(@PathVariable("id") Long id);

}

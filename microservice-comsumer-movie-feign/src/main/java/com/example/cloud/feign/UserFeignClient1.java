package com.example.cloud.feign;

import com.example.cloud.entity.User;
import com.example.config.Feign1Configuration;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/10/13 0013.
 */
//@FeignClient(name="microservice-provider-user",configuration = Feign1Configuration.class)
public interface UserFeignClient1 {
   //配置自定义的feign

    //@RequestLine("GET /simple/{id}")
   //public User findById(@Param("id") Long id);

}

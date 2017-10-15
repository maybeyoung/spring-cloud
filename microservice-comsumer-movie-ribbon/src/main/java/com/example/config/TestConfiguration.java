package com.example.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/10/12 0012.
 */
@Configuration  //修改ribbon默认的均衡算法为随机
public class TestConfiguration {

       @Bean
       public IRule ribbonRole(){
           return  new RandomRule();
       }
}

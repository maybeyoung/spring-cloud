package com.example.config;

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/10/13 0013.
 */
@Configuration
public class Feign1Configuration {
//自定义的feign的配置类
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
    //配置自定义日志
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}

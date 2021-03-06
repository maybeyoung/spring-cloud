package com.example.cloud.feign;

import com.example.cloud.entity.User;
import com.example.config.Feign3Configuration;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/10/13 0013.
 */
@FeignClient(name="microservice-provider-user",/*configuration = Feign3Configuration.class,fallback = HystrixClientFallback.class,*/fallbackFactory =HystrixFallbackFactory.class )
public interface UserFeignClient {
    //三个坑 1.@GetMapping不支持 2.@PathVariable得设置value
    // 3.只要参数是复杂对象，即使制定了GET方法，feign依然会以POST方法进行发送请求
   @RequestMapping(value = "/simple/{id}",method = RequestMethod.GET)
   public User findById(@PathVariable("id") Long id);

}
//fallback方法，要继承这个接口
@Component
class HystrixClientFallback implements UserFeignClient {
    @Override
    public User findById(Long id) {
        User user =  new User();
        user.setId(0L);
        return user;
    }
}

//fallbackFactory 如果需要访问导致回退触发的原因，可以使用fallbackFactory内部的属性@FeignClient
@Component
class HystrixFallbackFactory implements FallbackFactory<UserFeignClient> {

  private static final Logger logger = LoggerFactory.getLogger(HystrixFallbackFactory.class);
    @Override
    public UserFeignClient create(Throwable throwable) {
        HystrixFallbackFactory.logger.info("fallback; reason was: " + throwable.getMessage());
          return id -> {
                  User user = new User();
                     user.setId(-1L);
                  return user;

          };
    }
}

interface HystrixClientWithFallBackFactory extends UserFeignClient{

}

package com.csh.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：csh
 * @date ：Created in 2019/10/26 16:27
 * @description：
 */
@Configuration
public class ConfigBean {

    /**
     * 配置RestTemplate
     * 通过RestTemplate调用提供者服务 ，发送rest请求
     * 提供了多种访问http服务的方法，
     * 针对于访问rest服务 <strong>客户端</strong>的调用的模板类
     * @return
     */
    @Bean
    @LoadBalanced  //spring.cloud ribbon 实现客户端的负载均衡
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }


//    @Bean
//    public IRule myRule(){
//        //用我们选择的随机算法
//        return new RandomRule();
//    }


}

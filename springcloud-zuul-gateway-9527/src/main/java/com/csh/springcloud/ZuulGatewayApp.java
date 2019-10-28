package com.csh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author ：csh
 * @date ：Created in 2019/10/28 15:28
 * @description：
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulGatewayApp {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayApp.class,args);
    }

}

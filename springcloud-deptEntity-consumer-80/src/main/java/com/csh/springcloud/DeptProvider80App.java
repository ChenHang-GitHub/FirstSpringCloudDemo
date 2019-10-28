package com.csh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：csh
 * @date ：Created in 2019/10/26 16:25
 * @description：
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptProvider80App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider80App.class,args);
    }
}

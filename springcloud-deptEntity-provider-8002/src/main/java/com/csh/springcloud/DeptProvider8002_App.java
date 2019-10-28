package com.csh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author GongXings
 * @createTime 30 15:14
 * @description
 */
@SpringBootApplication
//本服务启动后会自动注册进eureka服务 (配置在yml文件)
@EnableEurekaClient
//@EnableDiscoveryClient
public class DeptProvider8002_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_App.class,args);
    }
}
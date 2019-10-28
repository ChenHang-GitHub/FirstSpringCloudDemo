package com.csh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：csh
 * @date ：Created in 2019/10/26 18:41
 * @description：
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaApp7002 {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaApp7002.class,args);
    }
}

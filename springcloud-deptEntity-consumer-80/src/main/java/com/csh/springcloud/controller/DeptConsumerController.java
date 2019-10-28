package com.csh.springcloud.controller;

import com.csh.springcloud.pojo.DeptEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ：csh
 * @date ：Created in 2019/10/26 16:29
 * @description：
 */
@RestController
public class DeptConsumerController {
//    private  final  String  REST_URL_PREFIX = "http://localhost:8001";
    private  final  String  REST_URL_PREFIX = "http://STUDY-SPRINGCLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add( DeptEntity deptEntity){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",deptEntity,Boolean.class);
    }

    @RequestMapping("/consumer/dept/findById/{deptNo}")
    public DeptEntity findById(Long deptNo){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/findById/"+deptNo,DeptEntity.class);
    }

    @RequestMapping("/consumer/dept/findAll")
    public List<DeptEntity> findAll(){

        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/findAll",List.class);
    }



}

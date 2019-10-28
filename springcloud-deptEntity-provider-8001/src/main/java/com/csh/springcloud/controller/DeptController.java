package com.csh.springcloud.controller;

import com.csh.springcloud.pojo.DeptEntity;
import com.csh.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：csh
 * @date ：Created in 2019/10/26 13:49
 * @description：
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean addDept(@RequestBody DeptEntity deptEntity) {
        return deptService.addDept(deptEntity);
    }

    @RequestMapping(value = "/dept/findById/{deptNo}",method = RequestMethod.GET)
    public DeptEntity findById(Long deptNo) {
        return  deptService.findById(deptNo);
    }

    @RequestMapping(value = "/dept/findAll", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "Hystrix_Get")
    public List<DeptEntity> findAll() {
        return deptService.findAll();
    }

    public List<DeptEntity> Hystrix_Get(){
        List<DeptEntity> deptEntities = new ArrayList<>();
        deptEntities.add(new DeptEntity().setDeptName("Hystrix_Get测试"));
        return deptEntities;
    }

}

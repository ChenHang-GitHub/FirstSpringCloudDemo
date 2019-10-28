package com.csh.springcloud.controller;

import com.csh.springcloud.pojo.DeptEntity;
import com.csh.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    public List<DeptEntity> findAll() {
        return deptService.findAll();
    }
}

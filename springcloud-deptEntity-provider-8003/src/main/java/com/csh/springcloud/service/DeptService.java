package com.csh.springcloud.service;

import com.csh.springcloud.pojo.DeptEntity;

import java.util.List;

/**
 * @author ：csh
 * @date ：Created in 2019/10/26 13:37
 * @description：
 */
public interface DeptService {


    /**
     * 插入
     * @param deptEntity
     * @return
     */
    boolean addDept(DeptEntity deptEntity);

    /**
     * 根据id查找
     * @param deptNo
     * @return
     */
    DeptEntity findById(Long deptNo);

    /**
     * 查询全部
     * @return
     */
    List<DeptEntity> findAll();
}

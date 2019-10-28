package com.csh.springcloud.dao;

import com.csh.springcloud.pojo.DeptEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ：csh
 * @date ：Created in 2019/10/26 13:29
 * @description：
 */
@Mapper
public interface DeptDao {
    /**
     * 插入
     * @param deptEntity
     *
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

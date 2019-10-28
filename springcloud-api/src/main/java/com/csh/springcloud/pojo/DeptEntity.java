package com.csh.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName: DeptEntity
 * @author: csh
 * @date: 2019/10/25  21:30
 * @Description:  部门实体类
 */
@SuppressWarnings("serial")   //忽略某些警告
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)  //@Accessors(chain = true)使用链式设置属性，set方法返回的是this对象。
public class DeptEntity implements Serializable {
    /**
     *  部门编码 主键
     */
    private Long deptNo;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 被存入数据库的数据库名称
     */
    private String dbSource;

    public DeptEntity(String deptName) {
        this.deptName = deptName;
    }

    public static void main(String[] args) {
//    测试    @Accessors(chain = true)
        DeptEntity deptEntity = new DeptEntity();
        deptEntity.setDeptNo(1L).setDeptName("123");
    }
}

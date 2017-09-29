package com.soul.wk.abstractfactory.product;

import com.soul.wk.abstractfactory.domain.Department;

public class DepartmentDaoMysqlImpl implements DepartmentDao {

    public void insertDepartment(Department department) {
        System.out.println(" Mysql 插入了一条记录： "+ department);
    }

    public Department getDepartment(int id) {

        System.out.println(" Mysql 中id为"+id+"的部门是宣传部");
        return new Department("宣传部");

    }
}

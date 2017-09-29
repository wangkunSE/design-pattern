package com.soul.wk.abstractfactory.product;

import com.soul.wk.abstractfactory.domain.Department;

public class DepartmentDaoSqlserverImpl implements DepartmentDao {

    public void insertDepartment(Department department) {
        System.out.println(" Sqlserver 插入了一条记录： "+ department);
    }

    public Department getDepartment(int id) {

        System.out.println(" Sqlserver 中id为"+id+"的部门是组织部");
        return new Department("组织部");

    }
}

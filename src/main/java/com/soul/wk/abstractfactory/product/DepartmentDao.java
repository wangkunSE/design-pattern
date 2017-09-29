package com.soul.wk.abstractfactory.product;

import com.soul.wk.abstractfactory.domain.Department;

public interface DepartmentDao {

    public void insertDepartment(Department department);
    public Department getDepartment(int id);
}

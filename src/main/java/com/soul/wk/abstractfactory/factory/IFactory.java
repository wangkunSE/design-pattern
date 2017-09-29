package com.soul.wk.abstractfactory.factory;

import com.soul.wk.abstractfactory.product.DepartmentDao;
import com.soul.wk.abstractfactory.product.UserDao;

public abstract class IFactory {

    public abstract UserDao createUserDao();
    public abstract DepartmentDao createDepartmentDao();
}

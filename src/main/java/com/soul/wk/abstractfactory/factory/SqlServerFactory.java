package com.soul.wk.abstractfactory.factory;

import com.soul.wk.abstractfactory.product.DepartmentDao;
import com.soul.wk.abstractfactory.product.DepartmentDaoSqlserverImpl;
import com.soul.wk.abstractfactory.product.UserDao;
import com.soul.wk.abstractfactory.product.UserDaoSqlserverImpl;

public class SqlServerFactory extends IFactory {

    public UserDao createUserDao() {
        return new UserDaoSqlserverImpl();
    }

    public DepartmentDao createDepartmentDao() {
        return new DepartmentDaoSqlserverImpl();
    }
}

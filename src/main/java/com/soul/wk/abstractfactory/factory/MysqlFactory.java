package com.soul.wk.abstractfactory.factory;

import com.soul.wk.abstractfactory.product.DepartmentDao;
import com.soul.wk.abstractfactory.product.DepartmentDaoMysqlImpl;
import com.soul.wk.abstractfactory.product.UserDao;
import com.soul.wk.abstractfactory.product.UserDaoMysqlImpl;

public class MysqlFactory extends IFactory {

    public UserDao createUserDao() {
        return new UserDaoMysqlImpl();
    }

    public DepartmentDao createDepartmentDao() {
        return new DepartmentDaoMysqlImpl();
    }
}

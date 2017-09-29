package com.soul.wk.abstractfactory.client;

import com.soul.wk.abstractfactory.domain.Department;
import com.soul.wk.abstractfactory.domain.User;
import com.soul.wk.abstractfactory.factory.IFactory;
import com.soul.wk.abstractfactory.factory.MysqlFactory;
import com.soul.wk.abstractfactory.factory.SqlServerFactory;
import com.soul.wk.abstractfactory.product.DepartmentDao;
import com.soul.wk.abstractfactory.product.UserDao;

public class clientDemo {

    public static void main(String[] args) {
        abstractDemo();
    }

    private static void abstractDemo() {

        User user = new User("狗蛋");
        user.setId(1);

        Department department = new Department("董事部");
        department.setId(0);


        IFactory factory = new MysqlFactory();
        UserDao userDao = factory.createUserDao();

        userDao.insert(user);
        userDao.getUser(1);


        DepartmentDao departmentDao = factory.createDepartmentDao();
        departmentDao.getDepartment(1);
        departmentDao.insertDepartment(department);
    }
}

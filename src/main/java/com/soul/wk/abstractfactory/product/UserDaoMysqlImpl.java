package com.soul.wk.abstractfactory.product;

import com.soul.wk.abstractfactory.domain.User;

public class UserDaoMysqlImpl implements UserDao {

    public void insert(User user) {
        System.out.println(" MySql 插入了一条用户记录: "+ user);
    }

    public User getUser(int id) {

        System.out.println(" Mysql 中id为"+id+"的用户是狗剩");
        return new User("狗剩");
    }
}

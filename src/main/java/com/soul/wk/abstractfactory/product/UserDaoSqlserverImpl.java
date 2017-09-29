package com.soul.wk.abstractfactory.product;

import com.soul.wk.abstractfactory.domain.User;

public class UserDaoSqlserverImpl implements UserDao {

    public void insert(User user) {
        System.out.println(" SqlServer 插入了一条用户记录: "+ user);
    }

    public User getUser(int id) {

        System.out.println(" SqlServer中id为"+id+"的用户是美美");
        return new User("美美");
    }
}

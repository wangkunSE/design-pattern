package com.soul.wk.abstractfactory.product;

import com.soul.wk.abstractfactory.domain.User;

public interface UserDao {

    public void insert(User user);
    public User getUser(int id);
}

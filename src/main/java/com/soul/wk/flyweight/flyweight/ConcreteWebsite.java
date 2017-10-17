package com.soul.wk.flyweight.flyweight;

public class ConcreteWebsite extends Website {

    public ConcreteWebsite(String name) {
        super(name);
    }

    public void use(User user) {

        System.out.println("网站分类:"+ name+"用户： "+user.getName());
    }
}

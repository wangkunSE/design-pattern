package com.soul.wk.flyweight.flyweight;

public abstract class Website {

    protected String name;

    public Website(String name){
        this.name = name;
    }

    public abstract void use(User user);
}

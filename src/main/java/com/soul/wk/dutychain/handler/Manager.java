package com.soul.wk.dutychain.handler;

import com.soul.wk.dutychain.domain.Request;

public abstract class Manager {

    protected String name;
    protected Manager manager;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public abstract String getLevel();
    public abstract void execute(Request request);
}

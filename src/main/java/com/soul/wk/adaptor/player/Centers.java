package com.soul.wk.adaptor.player;

public class Centers extends Player {
    public Centers(String name) {
        super(name);
    }

    public void attack() {
        System.out.println("中锋"+name+"进攻！");
    }

    public void defense() {
        System.out.println("中锋"+name+"防守！");
    }
}

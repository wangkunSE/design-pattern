package com.soul.wk.adaptor.player;

public class ForeignPlayer {

    private String name;

    public ForeignPlayer(String name) {
        this.name = name;
    }

    public void 进攻(){
        System.out.println("我"+name+"进攻！");
    }

    public void 防守(){
        System.out.println("我"+name+"防守！");
    }
}

package com.soul.wk.command.receiver;

public class Barbecuer {

    private String name;

    public Barbecuer(String name) {

        this.name = name;
    }

    public void barbecueChicken(){
        System.out.println(name+"烤鸡翅膀！！！");
    }

    public void barbecueMutton(){

        System.out.println(name+"烤羊肉串！！！");
    }
}

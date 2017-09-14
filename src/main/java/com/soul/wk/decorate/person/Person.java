package com.soul.wk.decorate.person;

import com.soul.wk.decorate.clothes.Fashion;

public class Person {

    private String name;
    private Fashion fashion;

    public void setFashion(Fashion fashion) {
        this.fashion = fashion;
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void ShowMe(){
        System.out.print(name+"穿了 ");
        if(fashion!=null)
        fashion.show();
    }

}

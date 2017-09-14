package com.soul.wk.decorate.test;

import com.soul.wk.decorate.clothes.BigTShirt;
import com.soul.wk.decorate.clothes.BigTrouser;
import com.soul.wk.decorate.clothes.Fashion;
import com.soul.wk.decorate.clothes.GreenHat;
import com.soul.wk.decorate.person.Person;

public class Demo {

    public static void main(String[] args) {
        showFashion();
    }

    private static void showFashion() {
        Person person = new Person("小明");
        Fashion fashion  = new BigTrouser(new BigTShirt(new GreenHat()));
        person.setFashion(fashion);
        person.ShowMe();
    }
}

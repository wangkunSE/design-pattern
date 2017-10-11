package com.soul.wk.memento;

import com.soul.wk.memento.cartaker.GameRoleCaretaker;
import com.soul.wk.memento.originor.GameRole;

public class mementoDemo {

    public static void main(String[] args) {

//        mementoTest();
        objectTostringTest();
    }

    private static void objectTostringTest() {
        GameRole xiaoming = new GameRole();
        xiaoming.initState();
        System.out.println(xiaoming.toString());
        System.out.println(xiaoming+"");
    }

    private static void mementoTest() {
        GameRoleCaretaker caretaker = new GameRoleCaretaker();
        GameRole xiaoming = new GameRole();
        xiaoming.initState();
        caretaker.setMemento(xiaoming.createMemento());

        xiaoming.showState();

        xiaoming.fight();
        xiaoming.showState();

        xiaoming.setMemento(caretaker.getMemento());
        xiaoming.showState();
    }
}

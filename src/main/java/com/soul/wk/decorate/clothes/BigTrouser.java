package com.soul.wk.decorate.clothes;

public class BigTrouser implements Fashion {

    private Fashion fashion;

    public BigTrouser() {
    }

    public BigTrouser(Fashion fashion) {
        this.fashion = fashion;
    }

    public void show() {
        if(fashion!=null)
        fashion.show();
        System.out.print("大裤子 ");
    }
}

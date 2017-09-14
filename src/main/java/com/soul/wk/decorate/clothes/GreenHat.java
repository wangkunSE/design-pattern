package com.soul.wk.decorate.clothes;

public class GreenHat implements Fashion {

    private Fashion fashion;

    public GreenHat() {
    }

    public GreenHat(Fashion fashion) {
        this.fashion = fashion;
    }

    public void show() {
        if(fashion!=null)
        fashion.show();
        System.out.print("绿帽子 ");
    }
}

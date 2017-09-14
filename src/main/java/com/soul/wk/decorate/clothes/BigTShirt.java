package com.soul.wk.decorate.clothes;

public class BigTShirt implements Fashion {

    private Fashion fashion;

    public BigTShirt() {
    }

    public BigTShirt(Fashion fashion) {
        this.fashion = fashion;
    }

    public void show() {
        if(fashion!=null)
        fashion.show();
        System.out.print(" 大T恤 ");
    }
}

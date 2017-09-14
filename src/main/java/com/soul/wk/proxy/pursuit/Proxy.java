package com.soul.wk.proxy.pursuit;

public class Proxy implements GiveGift {

    private Pursuit pursuit;


    public Proxy(SchoolGril schoolGril){
        this.pursuit = new Pursuit(schoolGril);
    }

    public void giveToy() {
        if (pursuit!=null){
            pursuit.giveToy();
        }
    }

    public void giveLopLip() {
        if (pursuit!=null)
            pursuit.giveLopLip();
    }

    public void giveFlower() {
        if (pursuit!=null){
            pursuit.giveFlower();
        }
    }
}

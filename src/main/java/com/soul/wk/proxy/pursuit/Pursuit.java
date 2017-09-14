package com.soul.wk.proxy.pursuit;

public class Pursuit implements GiveGift{

    private SchoolGril schoolGril;

    public Pursuit(SchoolGril schoolGril){
        this.schoolGril = schoolGril;
    }

    public void giveToy() {
        if(schoolGril!=null)
            System.out.println("Give "+schoolGril.getName()+" a toy.");
    }

    public void giveLopLip() {
        if (schoolGril!= null)
            System.out.println("Give "+schoolGril.getName()+" a candy.");
    }

    public void giveFlower() {
        if (schoolGril!=null)
            System.out.println("Give "+schoolGril.getName()+" some flowers.");
    }
}

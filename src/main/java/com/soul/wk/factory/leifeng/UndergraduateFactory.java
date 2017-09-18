package com.soul.wk.factory.leifeng;

public class UndergraduateFactory extends LeiFengFactory {
    public LeiFeng createLeifeng() {
        return new Undergraduate();
    }
}

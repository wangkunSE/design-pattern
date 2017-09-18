package com.soul.wk.factory.leifeng;

public class VoluteerFactory extends LeiFengFactory {
    public LeiFeng createLeifeng() {
        return new Voluteer();
    }
}

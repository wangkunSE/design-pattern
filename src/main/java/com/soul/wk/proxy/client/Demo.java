package com.soul.wk.proxy.client;

import com.soul.wk.proxy.pursuit.Proxy;
import com.soul.wk.proxy.pursuit.Pursuit;
import com.soul.wk.proxy.pursuit.SchoolGril;

public class Demo {

    public static void main(String[] args) {
        giveFift();
    }

    private static void giveFift() {

        Proxy proxy = new Proxy(new SchoolGril("丽丽"));
        proxy.giveToy();
        proxy.giveFlower();
        proxy.giveLopLip();

    }
}

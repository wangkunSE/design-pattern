package com.soul.wk.builder;

import com.soul.wk.builder.builder.ChickenLegHamburgerBuilder;
import com.soul.wk.builder.builder.FiredChickenLegHamburgerBuilder;
import com.soul.wk.builder.builder.HamburgerBuilder;
import com.soul.wk.builder.director.HamburgerDirector;
import com.soul.wk.builder.product.Hamburger;

public class testDemo {

    public static void main(String[] args) {
        builderDemo();
    }

    private static void builderDemo() {

        HamburgerBuilder chickenLegHamburgerBuilder = new ChickenLegHamburgerBuilder();
        HamburgerBuilder firedChickenLegHamburgerBuilder = new FiredChickenLegHamburgerBuilder();

        HamburgerDirector hamburgerDirector = new HamburgerDirector(chickenLegHamburgerBuilder);
        Hamburger hamburger = hamburgerDirector.getHamburger();
        hamburger.Show();

        System.out.println("==============================");

        HamburgerDirector hamburgerDirector1 = new HamburgerDirector(firedChickenLegHamburgerBuilder);
        Hamburger hamburger1 = hamburgerDirector1.getHamburger();
        hamburger1.Show();
    }
}

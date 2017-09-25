package com.soul.wk.builder.builder;

import com.soul.wk.builder.product.Hamburger;

public class ChickenLegHamburgerBuilder extends HamburgerBuilder {

    Hamburger hamburger = new Hamburger("板烧鸡腿堡");

    public void chooseBread() {

        System.out.println("step1:选取两片长方形面包");
    }

    public void chooseVegetable() {
        hamburger.setVegetable("生菜");
        System.out.println("step2:加入生菜，西红柿，酸黄瓜");
    }

    public void chooseMeat() {
        hamburger.setMeat("鸡腿肉");
        System.out.println("step3:选取上好的鸡腿肉，煎熟，烘烤成金黄色");
    }

    public void chooseSauce() {
        hamburger.setSauce("烧烤酱");
        System.out.println("step4:加入烧烤酱，完成");
    }

    public Hamburger getHamburger() {

        return hamburger;
    }
}

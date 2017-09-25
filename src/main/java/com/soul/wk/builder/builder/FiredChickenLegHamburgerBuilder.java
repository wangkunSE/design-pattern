package com.soul.wk.builder.builder;

import com.soul.wk.builder.product.Hamburger;

public class FiredChickenLegHamburgerBuilder extends HamburgerBuilder {

    private Hamburger hamburger = new Hamburger("脆皮鸡腿堡");

    public void chooseBread() {
        System.out.println("step1:选取两片标准圆面包");
    }

    public void chooseVegetable() {
        hamburger.setVegetable("生菜");
        System.out.println("step2:加入生菜");
    }

    public void chooseMeat() {
        hamburger.setMeat("鸡腿肉");
        System.out.println("step3:选取上好的鸡腿肉，炸成金黄色");
    }

    public void chooseSauce() {
        hamburger.setSauce("沙拉酱");
        System.out.println("step4:加入沙拉酱，完成");
    }

    public Hamburger getHamburger() {
        return hamburger;
    }
}

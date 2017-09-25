package com.soul.wk.builder.builder;

import com.soul.wk.builder.product.Hamburger;

public abstract class HamburgerBuilder {

    public abstract void chooseBread();
    public abstract void chooseVegetable();
    public abstract void chooseMeat();
    public abstract void chooseSauce();
    public abstract Hamburger getHamburger();
}

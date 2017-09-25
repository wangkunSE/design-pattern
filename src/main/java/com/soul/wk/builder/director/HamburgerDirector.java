package com.soul.wk.builder.director;

import com.soul.wk.builder.builder.ChickenLegHamburgerBuilder;
import com.soul.wk.builder.builder.FiredChickenLegHamburgerBuilder;
import com.soul.wk.builder.builder.HamburgerBuilder;
import com.soul.wk.builder.product.Hamburger;

public class HamburgerDirector {

    private HamburgerBuilder hamburgerBuilder;

    public HamburgerDirector(HamburgerBuilder hamburgerBuilder) {
        this.hamburgerBuilder = hamburgerBuilder;
        hamburgerBuilder.chooseBread();
        hamburgerBuilder.chooseMeat();
        hamburgerBuilder.chooseVegetable();
        hamburgerBuilder.chooseSauce();
    }

    public Hamburger getHamburger(){
        return hamburgerBuilder.getHamburger();
    }

}

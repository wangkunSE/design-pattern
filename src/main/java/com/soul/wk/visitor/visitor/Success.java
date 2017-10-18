package com.soul.wk.visitor.visitor;

import com.soul.wk.visitor.person.Man;
import com.soul.wk.visitor.person.Woman;

public class Success extends Visitor {

    public void getManConclusion(Man man) {
        System.out.println(man.getClass().getName()+"成功时,背后往往有个成功的女人");
    }

    public void getWomanConclusion(Woman woman) {
        System.out.println(woman.getClass().getName()+"成功时，背后往往有个不成功的男人");
    }
}

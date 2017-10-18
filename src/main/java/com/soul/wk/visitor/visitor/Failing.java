package com.soul.wk.visitor.visitor;

import com.soul.wk.visitor.person.Man;
import com.soul.wk.visitor.person.Woman;

public class Failing extends Visitor {
    public void getManConclusion(Man man) {

        System.out.println(man.getClass().getName()+"失败时，谁也不用劝!");
    }

    public void getWomanConclusion(Woman woman) {
        System.out.println(woman.getClass().getName()+"失败时，谁也劝不了!");
    }
}

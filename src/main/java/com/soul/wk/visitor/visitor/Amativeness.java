package com.soul.wk.visitor.visitor;

import com.soul.wk.visitor.person.Man;
import com.soul.wk.visitor.person.Woman;

public class Amativeness extends Visitor {
    public void getManConclusion(Man man) {
        System.out.println(man.getClass().getName()+"恋爱时，往往不懂要装懂");
    }

    public void getWomanConclusion(Woman woman) {
        System.out.println(woman.getClass().getName()+"恋爱时，往往懂要装不懂");
    }
}

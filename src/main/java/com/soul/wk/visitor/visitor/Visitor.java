package com.soul.wk.visitor.visitor;

import com.soul.wk.visitor.person.Man;
import com.soul.wk.visitor.person.Woman;

public abstract class Visitor {

    public abstract void getManConclusion(Man man);
    public abstract void getWomanConclusion(Woman woman);
}

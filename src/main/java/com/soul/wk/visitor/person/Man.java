package com.soul.wk.visitor.person;

import com.soul.wk.visitor.visitor.Visitor;

public class Man extends Person {
    public void Accept(Visitor visitor) {
        visitor.getManConclusion(this);
    }
}

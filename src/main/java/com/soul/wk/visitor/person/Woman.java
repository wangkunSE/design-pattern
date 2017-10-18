package com.soul.wk.visitor.person;

import com.soul.wk.visitor.visitor.Visitor;

public class Woman extends Person {
    public void Accept(Visitor visitor) {
        visitor.getWomanConclusion(this);
    }
}

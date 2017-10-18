package com.soul.wk.visitor.person;

import com.soul.wk.visitor.visitor.Visitor;

public abstract class Person {

    public abstract void Accept(Visitor visitor);
}

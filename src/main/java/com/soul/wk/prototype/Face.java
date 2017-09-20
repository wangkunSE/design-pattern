package com.soul.wk.prototype;

public class Face implements Cloneable {

    public Face() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Face{}";
    }
}

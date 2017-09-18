package com.soul.wk.factory.operation;

public class DividOperation implements Operation {


    public float getResult(int x,int y) {
        if(y==0)
            throw new IllegalArgumentException("denominator cannot be zero!");
        return ((float) x)/y;
    }
}

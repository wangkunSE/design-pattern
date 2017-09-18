package com.soul.wk.factory.factory;


import com.soul.wk.factory.operation.MinusOperation;
import com.soul.wk.factory.operation.Operation;

public class MinusFactory extends IFactory {
    public Operation createOperation() {
        return new MinusOperation();
    }
}

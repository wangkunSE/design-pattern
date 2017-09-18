package com.soul.wk.factory.factory;


import com.soul.wk.factory.operation.DividOperation;
import com.soul.wk.factory.operation.Operation;

public class DivideFactory extends IFactory {
    public Operation createOperation() {
        return new DividOperation();
    }
}

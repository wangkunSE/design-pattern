package com.soul.wk.factory.factory;


import com.soul.wk.factory.operation.MultiplyOperation;
import com.soul.wk.factory.operation.Operation;

public class MultiplyFactory extends IFactory {
    public Operation createOperation() {

        return new MultiplyOperation();
    }
}

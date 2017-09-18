package com.soul.wk.factory.factory;


import com.soul.wk.factory.operation.AddOperation;
import com.soul.wk.factory.operation.Operation;

public class AddFactory extends IFactory {
    public Operation createOperation() {
        return new AddOperation();
    }
}

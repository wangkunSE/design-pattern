package com.soul.wk.factory.selector;

import com.soul.wk.factory.factory.*;
import com.soul.wk.factory.operation.AddOperation;
import com.soul.wk.factory.operation.DividOperation;
import com.soul.wk.factory.operation.MinusOperation;
import com.soul.wk.factory.operation.MultiplyOperation;

public class FactorySelector {

    public static IFactory createFactory(String symbol){

        int flag = -1;

        if(symbol.trim().equals("+")){
            flag = 0;
        }else if(symbol.trim().equals("-")){
            flag = 1;
        }else if(symbol.trim().equals("*")){
            flag = 2;
        }else if (symbol.trim().equals("/")){
            flag = 3;

        }

        switch (flag){
            case 0:
                return new AddFactory();
            case 1:
                return new MinusFactory();
            case 2:
                return new MultiplyFactory();
            case 3:
                return new DivideFactory();
            default:
                throw new IllegalArgumentException("Please Input the correct symbol!!");
        }
    }
}

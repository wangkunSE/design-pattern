package com.soul.wk.factory.selector;

import com.soul.wk.factory.operation.*;

public class OperationFactory{


    public static Operation getOperation(String symbol){

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
                return new AddOperation();
            case 1:
                return new MinusOperation();
            case 2:
                return new MultiplyOperation();
            case 3:
                return new DividOperation();
            default:
                throw new IllegalArgumentException("Please Input the correct symbol!!");
        }

    }
}

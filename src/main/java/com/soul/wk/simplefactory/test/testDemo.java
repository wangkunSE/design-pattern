package com.soul.wk.simplefactory.test;

import com.soul.wk.simplefactory.operation.Operation;
import com.soul.wk.simplefactory.selector.OperationFactory;

import java.util.Scanner;

public class testDemo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please Input two number and a symbol: (x,y,symbol(+,-,*,/))");
        int numA = in.nextInt();
        int numB = in.nextInt();
        String symbol = in.next();

        Operation operation = OperationFactory.getOperation(symbol);
        System.out.println(operation.getResult(numA,numB));
    }
}

package com.soul.wk.factory.test;

import com.soul.wk.factory.factory.IFactory;
import com.soul.wk.factory.leifeng.LeiFeng;
import com.soul.wk.factory.leifeng.LeiFengFactory;
import com.soul.wk.factory.leifeng.VoluteerFactory;
import com.soul.wk.factory.operation.Operation;
import com.soul.wk.factory.selector.FactorySelector;

import java.util.Scanner;

public class testDemo {

    public static void main(String[] args) {

        LeiFengFactory fengFactory = new VoluteerFactory();
        LeiFeng leifeng = fengFactory.createLeifeng();

        leifeng.buyRice();
        leifeng.sweep();
        leifeng.wash();
    }
}

package com.soul.wk.strategy.client;

import com.soul.wk.strategy.cash.CashContext;
import com.soul.wk.strategy.cash.CashNormal;
import com.soul.wk.strategy.cash.CashRebate;
import com.soul.wk.strategy.cash.CashReturn;

import java.util.Scanner;

public class clientDemo {

    static void marketOpen(){

        Scanner in = new Scanner(System.in);
        System.out.println("请输入单价：");
        double singlePrice = in.nextDouble();
        System.out.println("请输入数量：");
        int count = in.nextInt();
        System.out.println("请输入打折类型:(0:不打折,1:满300-100,2:全场8折)");
        int type = in.nextInt();

        CashContext cashContext = new CashContext(type);

        double total = cashContext.computePrice(singlePrice*count);
        System.out.println("您的消费总额是："+total);



    }

    public static void main(String[] args) {
        marketOpen();
    }
}

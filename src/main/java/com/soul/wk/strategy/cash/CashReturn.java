package com.soul.wk.strategy.cash;

public class CashReturn implements CashSuper {

    private double moneyCondition;
    private double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    public double acceptCash(double money) {
        if(money >= moneyCondition)
            money= money - Math.floor(money / moneyCondition)*moneyReturn;
        return money;
    }
}

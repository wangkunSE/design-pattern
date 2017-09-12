package com.soul.wk.strategy.cash;

public class CashRebate implements CashSuper {

    private double count;

    public CashRebate( double count) {
        this.count = count;
    }

    public double acceptCash(double money) {
        return money*count;
    }
}

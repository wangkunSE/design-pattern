package com.soul.wk.strategy.cash;

public class CashContext {

    CashSuper cashSuper;

    public CashContext(int type) {
        switch (type){

            case 0:
                cashSuper = new CashNormal();
                break;
            case 1:
                cashSuper = new CashReturn(300,100);
                break;
            case 2:
                cashSuper = new CashRebate(0.8);
                break;
            default:
                cashSuper = new CashNormal();
                break;
        }

    }

    public double computePrice(double money){
        return  cashSuper.acceptCash(money);
    }
}

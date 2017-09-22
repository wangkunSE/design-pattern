package com.soul.wk.facede.fund;

import com.soul.wk.facede.stock.AliStock;
import com.soul.wk.facede.stock.Stock;
import com.soul.wk.facede.stock.TecentStock;

public class RSFund extends Fund {

    private Stock stock1;
    private Stock stock2;


    public RSFund() {
        super();
        this.stock1 = new AliStock();
        this.stock2 = new TecentStock();
    }

    public synchronized void sellFund() {
        stock1.sell();
        stock2.sell();
    }

    public synchronized void buyFund() {
        stock1.buy();
        stock2.buy();
    }
}

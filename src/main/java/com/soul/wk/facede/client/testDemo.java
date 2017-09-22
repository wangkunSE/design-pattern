package com.soul.wk.facede.client;

import com.soul.wk.facede.fund.Fund;
import com.soul.wk.facede.fund.RSFund;

public class testDemo {

    public static void main(String[] args) {
        invest();
    }

    private static void invest() {

        Fund fund = new RSFund();
        fund.buyFund();
        fund.sellFund();
    }
}

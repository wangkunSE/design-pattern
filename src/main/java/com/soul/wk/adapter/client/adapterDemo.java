package com.soul.wk.adapter.client;

import com.soul.wk.adapter.player.Forwards;
import com.soul.wk.adapter.player.Guards;
import com.soul.wk.adapter.player.Player;
import com.soul.wk.adapter.player.Translator;

public class adapterDemo {

    public static void main(String[] args) {
        adapterTest();
    }

    private static void adapterTest() {
        Player ym = new Translator("姚明");
        Player md = new Guards("麦迪");
        Player jms = new Forwards("詹姆斯");

        ym.attack();
        ym.defense();
        md.attack();
        jms.defense();
    }
}

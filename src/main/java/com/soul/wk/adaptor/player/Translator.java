package com.soul.wk.adaptor.player;

public class Translator extends Player {


    ForeignPlayer foreignPlayer;

    public Translator(String name) {
        super(name);
        foreignPlayer = new ForeignPlayer(name);
    }

    public void attack() {
        foreignPlayer.进攻();
    }

    public void defense() {
        foreignPlayer.防守();
    }
}

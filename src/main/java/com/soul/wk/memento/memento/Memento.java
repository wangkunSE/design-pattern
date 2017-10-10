package com.soul.wk.memento.memento;

public class Memento {

    private int attack;
    private int defense;
    private int vitality;

    public Memento(int attack, int defense, int vitality) {
        this.attack = attack;
        this.defense = defense;
        this.vitality = vitality;
    }

    public Memento getMemento(){
        return this;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getVitality() {
        return vitality;
    }
}

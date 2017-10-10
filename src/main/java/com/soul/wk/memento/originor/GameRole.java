package com.soul.wk.memento.originor;

import com.soul.wk.memento.memento.Memento;

public class GameRole {

    private int attack;
    private int defense;
    private int vitality;

    public void setMemento(Memento memento){
        this.vitality = memento.getVitality();
        this.attack = memento.getAttack();
        this.defense = memento.getDefense();
    }

    public Memento createMemento(){

        return new Memento(this.attack,this.defense,this.vitality);
    }

    public void initState(){
        this.attack = 100;
        this.defense = 100;
        this.vitality = 100;
    }

    public void fight(){
        this.vitality = 0;
        this.defense = 0;
        this.attack = 0;
    }

    public void showState(){
        System.out.println( this.toString());
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    @Override
    public String toString() {
        return "GameRole{" +
                "attack=" + attack +
                ", defense=" + defense +
                ", vitality=" + vitality +
                '}';
    }
}

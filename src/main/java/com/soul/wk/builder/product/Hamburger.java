package com.soul.wk.builder.product;

public class Hamburger {

    private String name;
    private String meat;
    private String vegetable;
    private String sauce;

    public void Show(){

        System.out.println(name);
        System.out.println(meat);
        System.out.println(vegetable);
        System.out.println(sauce);
    }

    public Hamburger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getVegetable() {
        return vegetable;
    }

    public void setVegetable(String vegetable) {
        this.vegetable = vegetable;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }
}

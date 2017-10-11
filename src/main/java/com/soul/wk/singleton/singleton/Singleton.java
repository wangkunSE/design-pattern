package com.soul.wk.singleton.singleton;

public class Singleton {

    private static Singleton singleton;
    private static final Object o = new Object();
    private Singleton(){

    }

    public static Singleton getInstance(){

        if( singleton == null){

            synchronized (o){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

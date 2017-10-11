package com.soul.wk.singleton.client;

import com.soul.wk.singleton.singleton.HungrySingleton;
import com.soul.wk.singleton.singleton.Singleton;

public class singletonDemo {

    public static void main(String[] args) {
        singletonTest();
        hungrySingletonTest();
    }

    private static void hungrySingletonTest() {
        HungrySingleton singleton1 = HungrySingleton.getInstance();
        HungrySingleton singleton2 = HungrySingleton.getInstance();

        if (singleton1.equals(singleton2)){
            System.out.println("饿汉式：两对象相同");
        }
    }

    private static void singletonTest() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton1);
        if( singleton.equals(singleton1)){

            System.out.println("两对象相同！");
        }

    }
}

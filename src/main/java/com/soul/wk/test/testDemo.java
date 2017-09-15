package com.soul.wk.test;

public class testDemo {

    /**
     * -Xms 10M -Xmn10M -Xmx 20M -XX:+PrintGCDetails
     *
     * @param args
     */
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {

        byte[] a, b, c, d;
        a = new byte[_1MB / 4];
        b = new byte[_1MB / 4];
        d = new byte[4 * _1MB];
        c = new byte[4 * _1MB];
        System.out.println("llllllll");
        c = null;
        c = new byte[4 * _1MB];
        System.out.println("------------");


    }
}

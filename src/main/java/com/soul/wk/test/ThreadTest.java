package com.soul.wk.test;

public class ThreadTest {

    private String name;

    public ThreadTest(String name) {
        this.name = name;
    }

    synchronized void  fa(){
        System.out.println(name+ "fa");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void fb(){
        System.out.println(name +"fb");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class Fun implements Runnable{

        private ThreadTest threadTest;
        private ThreadTest threadTest2;

        public Fun(ThreadTest threadTest, ThreadTest threadTest2) {
            this.threadTest = threadTest;
            this.threadTest2 = threadTest2;
        }

        public void run() {

            threadTest.fa();
            threadTest2.fb();
        }
    }

    public static void main(String[] args) {
        ThreadTest a = new ThreadTest("a");
        ThreadTest b = new ThreadTest("b");

        Thread threadA = new Thread(new Fun(a,b));
        Thread threadB = new Thread(new Fun(a,b));

        threadA.start();
        threadB.start();
    }
}

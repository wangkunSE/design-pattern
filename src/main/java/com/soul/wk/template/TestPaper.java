package com.soul.wk.template;

public abstract class TestPaper {
    
    public void questionAndAnswer(){

        System.out.println("试题一");
        answer1();
        System.out.println("试题二");
        answer2();
        System.out.println("试题三");
        answer3();
    }

    protected abstract void answer3();

    protected abstract void answer2();

    protected abstract void answer1();
}

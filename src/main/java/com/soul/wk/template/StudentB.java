package com.soul.wk.template;

public class StudentB extends TestPaper {

    private String name;

    public StudentB(String name) {
        this.name = name;
    }

    protected void answer3() {
        System.out.println(name+" :答案三");
    }

    protected void answer2() {
        System.out.println(name+" :答案二");
    }

    protected void answer1() {
        System.out.println(name+" :答案一");
    }
}

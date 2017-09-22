package com.soul.wk.template;

public class testDemo {

    public static void main(String[] args) {
        examBegin();
    }

    private static void examBegin() {

        TestPaper studentA = new StudentA("狗剩");
        TestPaper studentB = new StudentB("美美");

        studentA.questionAndAnswer();
        studentB.questionAndAnswer();
    }
}

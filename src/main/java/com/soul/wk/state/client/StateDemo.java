package com.soul.wk.state.client;

import com.soul.wk.state.context.Work;

public class StateDemo {

    public static void main(String[] args) {
        stateTest();
    }

    private static void stateTest() {
        Work work = new Work();
        work.writeProgram();
        work.setHour(13);
        work.writeProgram();
        work.setHour(16);
        work.writeProgram();
        work.setHour(22);
        work.writeProgram();
        work.setFinishWork(true);
        work.writeProgram();
    }
}

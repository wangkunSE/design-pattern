package com.soul.wk.state.state;

import com.soul.wk.state.context.Work;

public class SleepingState extends State {
    public void writeProgram(Work work) {
        if (work.isFinishWork()){
            System.out.println("工作完成，下班！！");
        }else {
            System.out.println("不行了，先睡一波Zzzzzzz");
        }
    }
}

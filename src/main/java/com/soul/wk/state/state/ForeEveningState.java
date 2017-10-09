package com.soul.wk.state.state;

import com.soul.wk.state.context.Work;

public class ForeEveningState extends State {
    public void writeProgram(Work work) {
        if (work.getHour() < 18){
            System.out.println("快下班了，努力工作！！");
        }else if (work.isFinishWork()){
            System.out.println("工作完成，下班！！");
        }else {
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}

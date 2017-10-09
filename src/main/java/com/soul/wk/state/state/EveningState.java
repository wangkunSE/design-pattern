package com.soul.wk.state.state;

import com.soul.wk.state.context.Work;

public class EveningState extends State {
    public void writeProgram(Work work) {
        if (work.isFinishWork()){
            System.out.println("工作完成了，终于可以下班了！！");
        }else if (work.getHour()<21){
            System.out.println("好困，快不行了QAQ");
        }else {
            work.setState(new SleepingState());
            work.writeProgram();
        }
    }
}

package com.soul.wk.state.state;

import com.soul.wk.state.context.Work;

public class forenoonState extends State {
    public void writeProgram(Work work) {
        if (work.getHour() < 12){
            System.out.println("美好的一天开始了，加油工作！！");
        }else {
            work.setState(new afternoonState());
            work.writeProgram();
        }
    }
}

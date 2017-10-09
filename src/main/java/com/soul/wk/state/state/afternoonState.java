package com.soul.wk.state.state;

import com.soul.wk.state.context.Work;

public class afternoonState extends State {

    public void writeProgram(Work work) {

        if (work.getHour()<16){
            System.out.println("精神不错，继续工作！！");
        }else {
            work.setState(new ForeEveningState());
            work.writeProgram();
        }
    }
}

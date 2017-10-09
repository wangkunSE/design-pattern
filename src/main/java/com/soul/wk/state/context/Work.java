package com.soul.wk.state.context;

import com.soul.wk.state.state.State;
import com.soul.wk.state.state.forenoonState;

public class Work {

    private boolean finishWork;
    private State state;
    private int hour;

    public Work(){
        state = new forenoonState();
    }

    public boolean isFinishWork() {
        return finishWork;
    }

    public void setFinishWork(boolean finishWork) {
        this.finishWork = finishWork;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void writeProgram(){
        state.writeProgram(this);
    }
}

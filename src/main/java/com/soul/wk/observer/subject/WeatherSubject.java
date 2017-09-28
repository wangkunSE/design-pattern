package com.soul.wk.observer.subject;

import com.soul.wk.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject {

    private String state;

    List<Observer> observerList = new ArrayList<Observer>();
    public void Deatch(Observer o) {
        observerList.remove(o);
    }

    public void Attach(Observer o) {
        observerList.add(o);
    }

    public void Notify() {
        for( Observer o: observerList){
            o.Update();
        }
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

package com.soul.wk.observer.subject;

import com.soul.wk.observer.observer.Observer;

public interface Subject {

    void Deatch(Observer o );
    void Attach(Observer o);
    void Notify();

    String getState();
}

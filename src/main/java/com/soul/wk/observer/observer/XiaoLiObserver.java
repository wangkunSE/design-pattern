package com.soul.wk.observer.observer;

import com.soul.wk.observer.subject.Subject;

public class XiaoLiObserver implements Observer {

    Subject subject;

    public XiaoLiObserver(Subject subject) {
        this.subject = subject;
    }

    public void Update() {
        if(subject.getState().equals("下雨了"))
            System.out.println("下雨了，不上学！");
        else if ("没下雨".equals(subject.getState())){
            System.out.println("天晴了，要上学！！");
        }else
            return;
    }
}

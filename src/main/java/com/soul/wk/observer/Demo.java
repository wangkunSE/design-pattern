package com.soul.wk.observer;

import com.soul.wk.observer.observer.Observer;
import com.soul.wk.observer.observer.XiaoLiObserver;
import com.soul.wk.observer.subject.Subject;
import com.soul.wk.observer.subject.WeatherSubject;

public class Demo {

    public static void main(String[] args) {
        observerDemo();
    }

    private static void observerDemo() {

        WeatherSubject weather = new WeatherSubject();
        Observer xiaoming = new XiaoLiObserver(weather);
        weather.Attach(xiaoming);

        weather.setState("下雨了");
        weather.Notify();

    }
}

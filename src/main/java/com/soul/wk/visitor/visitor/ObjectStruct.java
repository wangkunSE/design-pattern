package com.soul.wk.visitor.visitor;



import com.soul.wk.visitor.person.Person;

import java.util.ArrayList;
import java.util.List;

public class ObjectStruct {

    List<Person> list = new ArrayList<Person>();

    public void addState(Person visitor){
        list.add(visitor);
    }

    public void removeState(Person visitor){
        list.remove(visitor);
    }

    public void dispaly(Visitor visitor){
        for(Person person: list){
            person.Accept(visitor);
        }
    }
}

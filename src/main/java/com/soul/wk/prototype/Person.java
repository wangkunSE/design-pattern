package com.soul.wk.prototype;

public class Person implements Cloneable {


    private int age;
    private String name;
    private Head head;

    public Person() {
    }

    public Person(int age, String name, Head head) {
        this.age = age;
        this.name = name;
        this.head = head;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person)super.clone();
        person.head = (Head) this.head.clone();
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", head=" + head +
                '}';
    }
}

package com.soul.wk.prototype;

public class testDemo {

    public static void main(String[] args) {
        try {
            testPrototype();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private static void testPrototype() throws CloneNotSupportedException {

        Person person1 = new Person();

        person1.setAge(11);
        person1.setHead(new Head(new Face()));
        person1.setName("xiao ming");

        Person person2 = (Person) person1.clone();
        person2.setName("mei mei");
        person2.setAge(13);

        System.out.println(person1);
        System.out.println(person2);

        System.out.println("-------------------");
        System.out.println("person1.name == person2.name?"+(person1.getName() == person2.getName()));
        System.out.println("person1.head == person2.head?"+(person1.getHead() == person2.getHead()));
        System.out.println("person1.head.face == person2.head.face?"+(person1.getHead().getFace() == person2.getHead().getFace()));

    }

}

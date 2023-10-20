package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Person> people = new ArrayList();
        people.add(new Person("ana", 2001));
        people.add(new Student("dan",2002,"software Development"));
        people.add(new Instructor("kate",1992, 27000));
        System.out.println(people);
    }

}
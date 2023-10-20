package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Person> people = new ArrayList();
        people.add(new Person("Ana", 2001));
        people.add(new Student("Dan", 2002, "software Development"));
        people.add(new Student("Jack", 1999, "History"));
        people.add(new Student("Sam", 1998, "Games Development"));
        people.add(new Instructor("kate", 1992, 27000));
        people.add(new Instructor("Victoria", 1988, 44000));
        people.add(new Instructor("Finn", 1979, 42000));
        //System.out.println(people);

        System.out.println("\npeople in ArrayList");
        for (Person person : people) {

            System.out.println(person.toString());
        }

        System.out.println("\nStudents in ArrayList");

        for (Person person : people) {
            if (person instanceof Student) {
                System.out.println("Name: "+ person.getName() + " Major: "+ ((Student) person).getMajor());
            }
        }
        System.out.println("\nInstructors in ArrayList");

        for (Person person : people) {
            if (person instanceof Instructor) {
                System.out.println("Name: "+ person.getName() + " Salary: " + ((Instructor) person).getSalary());
            }

        }
    }
}
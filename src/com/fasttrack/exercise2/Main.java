package com.fasttrack.exercise2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new LinkedList<>();
        person.add(new Person("Denisa", 27, "brunet"));
        person.add(new Person("Adina", 22, "saten"));
        person.add(new Person("Alina", 22, "brunet"));
        person.add(new Person("Natalia", 33, "blond"));
        person.add(new Person("Florina", 27, "brunet"));
        person.add(new Person("Carla", 25, "blond"));
        PersonList personList1 = new PersonList(person);
        System.out.println(personList1.personName());
        System.out.println(personList1.fromNameToAge());
        System.out.println(personList1.olderThanAge(24));
        System.out.println(personList1.fromHairColorToName());
        System.out.println(personList1.fromAgeToPerson());



    }
}

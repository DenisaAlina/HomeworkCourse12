package com.fasttrack.exercise2;

import com.fasttrack.exercise3.Employee;

import java.util.*;

public class PersonList {
    private List<Person> personlist;

    public PersonList(List<Person> personlist) {
        this.personlist = personlist;
    }

    public List<String> personName(){
        List<String> nameList = new LinkedList<>();
        for(Person person : personlist){
            nameList.add(person.getName());
        }
        return nameList;
    }

    public Map<String, Integer> fromNameToAge(){
        Map<String, Integer > nameToAge = new HashMap<>();
        for(Person person : personlist){
            nameToAge.put(person.getName(), person.getAge());
        }
        return nameToAge;
    }

    public List<Person> olderThanAge(int age){
        List<Person> olderPerson = new LinkedList<>();
        for(Person person : personlist){
            if(person.getAge()> age){
                olderPerson.add(person);
            }
        }
        return olderPerson;
    }

    public  Map<String, List<String>> fromHairColorToName(){
        Map<String, List<String>> result = new HashMap<>();
        for(Person person: personlist){
            List<String> name = result.get(person.getHairColor());
            if(name == null){
                name = new LinkedList<>();
                result.put(person.getHairColor(), name);
            }
            name.add(person.getName());
        }
        return result;
    }

    public  Map<Integer, List<Person>> fromAgeToPerson(){
        Map<Integer, List<Person>> result = new HashMap<>();
        for(Person person: personlist){
            List<Person> name = result.get(person.getAge());
            if(name == null){
                name = new LinkedList<>();
                result.put(person.getAge(), name);
            }
            name.add(person);
        }
        return result;
    }


}

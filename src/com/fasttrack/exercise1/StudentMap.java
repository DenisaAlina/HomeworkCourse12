package com.fasttrack.exercise1;

import java.util.*;

public class StudentMap {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Denisa ", 9);
        map.put("Roxana ", 7);
        map.put("Adina ", 10);
        map.put("Alina ", 10);
        map.put("Dorin ", 6);
        map.put("Adrian ", 8);
        map.put("David ", 9);
        System.out.println(map);
        System.out.println(findStudent(map));
    }

    public static List<String> findStudent(Map<String, Integer> map){
        Integer maxGrade= Collections.max(map.values());
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        List<String> student  = new LinkedList<>();
        for(Map.Entry entry : entries){
            if(entry.getValue() == maxGrade){
                 student.add((String) entry.getKey());

            }
        }
        return student;
    }
}

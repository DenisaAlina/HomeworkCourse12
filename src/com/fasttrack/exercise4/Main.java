package com.fasttrack.exercise4;

import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> activities =new LinkedList<>();
        activities.add("reading books");
        activities.add("jogging");
        activities.add("working");
        activities.add(("watching movies"));
        activities.add(("studying"));
        DaySchedule schedule = new DaySchedule(DaysOfTheWeek.MONDAY, activities );
        System.out.println(schedule);
    }
}

package com.fasttrack.exercise3;

import com.fasttrack.exercise2.Person;

public class Employee extends Person {
    private int salary;
    private String company;

    public Employee(String name, int age, String hairColor, int salary, String company) {
        super(name, age, hairColor);
        this.salary=salary;
        this.company=company;
    }

    public int getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", company='" + company + '\'' +
                '}';
    }
}

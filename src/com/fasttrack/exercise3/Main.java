package com.fasttrack.exercise3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee("Ghent Denisa", 27, "brunet", 2000, "Tech Solutions"));
        employeeList.add(new Employee("Pasca Larisa", 26, "saten", 2200, "Tech Solutions"));
        employeeList.add(new Employee("Bulzan Andrei", 37, "blond", 3500, "Fortech"));
        employeeList.add(new Employee("Chis Ovidiu", 23, "brunet", 3700, "TechHub"));
        employeeList.add(new Employee("Fodor Adina", 20, "saten", 2400, "Qbizz"));
        employeeList.add(new Employee("Cristea Stefan", 37, "brunet", 4800, "Fasttrack"));
        EmployeesList listOfEmployee = new EmployeesList(employeeList);
        System.out.println(listOfEmployee.biggerSalaries(3000));
        System.out.println(listOfEmployee.fromCompanyToPersons());
        System.out.println(listOfEmployee.sumOfSalary());
        System.out.println(listOfEmployee.theBiggestSalary());


    }
}

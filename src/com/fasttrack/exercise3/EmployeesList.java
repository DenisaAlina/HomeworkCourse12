package com.fasttrack.exercise3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EmployeesList {
    private List<Employee> employeeList;

    public EmployeesList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> biggerSalaries(int ammount){
        List<Employee> result = new LinkedList<>();
        for(Employee employee : employeeList){
            if(employee.getSalary()> ammount){
                result.add(employee);
            }
        }
        return result;
    }

    public Map<String, List<Employee>> fromCompanyToPersons(){
        Map<String, List<Employee>> result = new HashMap<>();
        for(Employee employee : employeeList){
            List<Employee> persons = result.get(employee.getCompany());
            if(persons == null){
                persons= new LinkedList<>();
                result.put(employee.getCompany(), persons);
            }
            persons.add(employee);
        }
        return result;
    }

    public int sumOfSalary(){
        int sum = 0;
        for(Employee employee : employeeList){
            sum+= employee.getSalary();
        }
        return sum;
    }

    public String theBiggestSalary(){
        int max =Integer.MIN_VALUE;
        int companyIndex= 1;
        for(Employee employee : employeeList){
            if(max< employee.getSalary()){
                max =employee.getSalary();
               // company= employee.getCompany();
              //  company=String.format("%s",employee.getCompany());
                companyIndex = employeeList.indexOf(employee);
            }
        }
        return (employeeList.get(companyIndex)).getCompany();
    }
}

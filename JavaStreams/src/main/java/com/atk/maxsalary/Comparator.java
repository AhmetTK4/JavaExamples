package com.atk.maxsalary;

import java.util.ArrayList;

import java.util.List;

public class Comparator {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of());
        employees.add(new Employee("Ahmet",45000));
        employees.add(new Employee("Ceren",35000));
        employees.add(new Employee("Semih",55000));
        employees.add(new Employee("Yaren",72000));

        employees.stream()
                .max(java.util.Comparator.comparingDouble(Employee::getSalary))
                .ifPresent(System.out::println);

    }
}

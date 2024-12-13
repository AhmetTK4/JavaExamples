package com.atk.mapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ayse",82.5));
        students.add(new Student("Ali",91.7));
        students.add(new Student("Veli",72.4));
        students.add(new Student("Ziya",61));

        List<String> highAchievers = students.stream()
                .filter(s -> s.getGrade() > 70)
                .map(s -> s.getName().toUpperCase())
                .collect(Collectors.toList());

        highAchievers.forEach(System.out::println);
    }
}

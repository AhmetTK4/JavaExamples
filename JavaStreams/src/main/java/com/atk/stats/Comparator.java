package com.atk.stats;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Comparator {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of());
        people.add(new Person("Hakan", (byte) 35));
        people.add(new Person("Seray", (byte) 47));
        people.add(new Person("Murat", (byte) 27));
        people.add(new Person("Nazan", (byte) 27));

        Map<Byte,Long> map = people.stream()
                .collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));

        System.out.println(map);
    }


}

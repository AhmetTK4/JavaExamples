package com.atk.partitioned;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partitioned {
    public static void main(String[] args) {
        List<String> items = Arrays.asList(
                "apple",
                "banana",
                "cherry",
                "apple",
                "banana",
                "date"
        );

        Map<Boolean , List<String>> partitioned = items.stream()
                .collect(Collectors.partitioningBy(item -> Collections.frequency(items,item)>1));

        System.out.println("Tekrar Edenler: " + partitioned.get(true));
        System.out.println("Benzersizler: " + partitioned.get(false));

    }
}

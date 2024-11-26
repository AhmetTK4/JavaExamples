package com.atk.grouped;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingFruits {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "apple",
                "apricot",
                "banana",
                "cherry",
                "blueberry",
                "avocado"
        );

        Map<Character, List<String>> groupingByFirstLetter = words.stream()
                .collect(Collectors.groupingBy(word-> word.charAt(0)));

        System.out.println(groupingByFirstLetter);
    }
}

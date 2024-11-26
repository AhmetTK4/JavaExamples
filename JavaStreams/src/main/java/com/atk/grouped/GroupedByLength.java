package com.atk.grouped;

import java.util.*;
import java.util.stream.Collectors;

public class GroupedByLength {

    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "cat",
                "dog",
                "elephant",
                "bird",
                "whale",
                "fish"
        );

        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(groupedByLength);
    }
}

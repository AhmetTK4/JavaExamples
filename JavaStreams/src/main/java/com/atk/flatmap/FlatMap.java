package com.atk.flatmap;

import java.util.Arrays;
import java.util.List;

public class FlatMap {

    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
          Arrays.asList("apple","banana"),
          Arrays.asList("cherry","date"),
          Arrays.asList("elderberry","fig","grape")
        );

        System.out.println("Nested: "+nestedList);

        List<String> flatList = nestedList.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println("Flat: "+ flatList);
    }
}

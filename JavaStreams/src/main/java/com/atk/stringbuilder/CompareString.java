package com.atk.stringbuilder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class CompareString {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","cherry","date");

        List<String> result = words.stream()
                .map(word -> new java.lang.StringBuilder(word).reverse().toString())
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        System.out.println(result);
    }



}

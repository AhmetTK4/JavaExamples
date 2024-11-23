package com.atk.parallel;

import java.util.stream.IntStream;

public class ParralelStreams {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        int sum = IntStream.range(1, 1_000_000)
                .parallel()
                .filter(num -> num % 2 == 0)
                .map(num-> num * num)
                .sum();

        long endTime = System.currentTimeMillis();
        System.out.println("Toplam: " + sum);
        System.out.println("Süre: " + (endTime - startTime) + "ms");

    }
}

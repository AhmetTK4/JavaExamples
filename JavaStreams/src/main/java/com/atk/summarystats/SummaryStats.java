package com.atk.summarystats;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SummaryStats {

    public static void main(String[] args) {
        IntSummaryStatistics stats = IntStream.of(10,20,30,40,50)
                .summaryStatistics();

        System.out.println("Toplam: " + stats.getSum());
        System.out.println("Ortalama: " + stats.getAverage());
        System.out.println("En Kucuk sayi: " + stats.getMin());
        System.out.println("En Buyuk sayi: " + stats.getMax());
        System.out.println("Eleman sayisi: "+ stats.getCount());
    }
}

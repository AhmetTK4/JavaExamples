package com.atk.convertprice;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Product> products = Arrays.asList(
                new Product("Laptop",22_000),
                new Product("Smartphone", 12_000),
                new Product("Tablet", 7_000)
        );

        //%20 zam geldi :)
        products.stream()
                .map(product -> new Product(product.getName(),product.getPrice()*1.20))
                .forEach(System.out::println);
    }
}

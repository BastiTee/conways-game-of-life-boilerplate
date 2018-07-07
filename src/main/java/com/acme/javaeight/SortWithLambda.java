package com.acme.javaeight;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithLambda {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        // ------------------------------------------------------------------------------------------------------
        // Traditional way
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        names.forEach(System.out::println);

        // ------------------------------------------------------------------------------------------------------
        // Lambda basic style
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });
        names.forEach(System.out::println);

        // ------------------------------------------------------------------------------------------------------
        // Lambda no return style
        Collections.sort(names, (String a, String b) -> b.compareTo(a));
        names.forEach(System.out::println);

        // ------------------------------------------------------------------------------------------------------
        // Lambda no return, no types style
        Collections.sort(names, (a, b) -> b.compareTo(a));
        names.forEach(System.out::println);

        // ------------------------------------------------------------------------------------------------------
        // Lambda with preset
        Collections.sort(names, Comparator.reverseOrder());
        names.forEach(System.out::println);

    }
}

package com.acme.javaeight;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {

    public static void main(String[] args) {

        List<Integer> myList = IntStream.range(0, 10).boxed().collect(Collectors.toList());

        //sequential stream
        myList
            .stream()  // not necessary here. only for comparison
            .forEach(p -> System.out.println("High Nums sequential=" + p));

        //parallel stream
        myList
            .parallelStream()
            .forEach(p -> System.out.println("High Nums parallel=" + p));

    }
}

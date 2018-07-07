package com.acme.javaeight;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReusableStreams {

    public static void main(String[] args) {

        Supplier<Stream<String>> streamSupplier =
            () -> Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> s.startsWith("a"));

        System.err.println(streamSupplier.get().anyMatch(s -> true));
        System.err.println(streamSupplier.get().noneMatch(s -> true));
    }
}

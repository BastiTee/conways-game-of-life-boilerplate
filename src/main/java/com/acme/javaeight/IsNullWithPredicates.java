package com.acme.javaeight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class IsNullWithPredicates {

    public static void main(String[] args) {
        Predicate<Object> predicate = (o) -> o == null || (o instanceof String && ((String) o).isEmpty());

        List<Boolean> results = new ArrayList<>();
        results.add(predicate.test("foo"));
        results.add(predicate.negate().test("foo"));
        results.add(predicate.test(null));
        results.add(predicate.test(""));

        results.forEach(System.err::println);

    }
}

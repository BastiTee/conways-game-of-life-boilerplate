package com.acme.javaeight;

import java.util.Arrays;
import java.util.Optional;

public class NullPointerSecurity {

    public static void main(String[] args) {

        Optional<String> optional = Optional.of("yo");
        Arrays.asList(
            optional.isPresent(),
            optional.orElse("fallback"),
            optional.equals("yo")
        ).forEach(System.out::println);
        // null-safe access
        optional.ifPresent((s) -> System.out.println("value present!"));

        optional = Optional.ofNullable(null); // of() does not work here, since the class needs a @NotNullable
        Arrays.asList(
            optional.isPresent(),
            optional.orElse("fallback"),
            optional.equals("yo")
        ).forEach(System.out::println);
        // null-safe access
        optional.ifPresent((s) -> System.out.println("value present!"));

    }
}

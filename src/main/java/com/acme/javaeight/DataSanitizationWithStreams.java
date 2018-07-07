package cloud.bastis.javaeight;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class DataSanitizationWithStreams {
    public static void main(String[] args) {

        // Generate random ints
        List<Integer> ints = new Random().ints(100).boxed().collect(Collectors.toList());

        // -------------------------------------------------------------------------------------
        // Work with list as a stream
        ints.stream()
                .distinct()
                .filter((i) -> (i >= 0))
                .sorted()
                .map(Object::toString)
                .limit(10)
                .forEach(System.err::println);

        // -------------------------------------------------------------------------------------
        // Get average using reduce 
        ints.stream().reduce((a, b) -> a + b).ifPresent((r) -> System.err.println("avg=" + (r / (long) ints.size())));

        // -------------------------------------------------------------------------------------
        // Haskell in JAva
        new Random().ints(100).boxed().collect(Collectors.toList()).stream().distinct()
                .filter((i) -> (i >= 0)).sorted().map(Object::toString).limit(10).map(Integer::parseInt)
                .reduce((a, b) -> a + b).ifPresent((r) -> System.err.println("avg=" + (r / 100)));
    }
}

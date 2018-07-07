package cloud.bastis.javaeight;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FunctionReferenceByHand {

    private static String squared(String s) {
        return String.valueOf(Integer.parseInt(s) * 2);
    }

    public static void main(String[] args) {
        // generate list of random strings
        List<String> strings = new Random()
                .ints(10)
                .mapToObj(Integer::toString)
                .collect(Collectors.toList());

        // call own method by reference on each element
        strings.forEach(FunctionReferenceByHand::squared);

        // print out
        strings.forEach(System.out::println);

    }
}

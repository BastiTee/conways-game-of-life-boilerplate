package cloud.bastis.javaeight;

import java.util.Arrays;
import java.util.List;

public class TestListForExistence {

    public static void main(String[] args) {

        // create demo data 
        List<String> names = Arrays.asList("stepan", "paul", "basti", "sönke", "andreas");

        // check for existence
        System.err.println(
                names.stream()
                        .anyMatch((e) -> e.equalsIgnoreCase("stepan"))); // true

        // check for some condition in the values itself
        System.err.println(
                names.stream()
                        .anyMatch((e) -> e.contains("ö"))); // true

        // check all values
        System.err.println(
                names.stream()
                        .noneMatch(String::isEmpty)); // true
    }

}

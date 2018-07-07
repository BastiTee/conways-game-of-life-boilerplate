package cloud.bastis.javaeight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.lang.Integer;

public class ForEachWithConsumer {

    public static void main(String[] args) {

        // ----------------------------------------------------------------------------------------------------
        // Data generation

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // ----------------------------------------------------------------------------------------------------
        // ForEach with explicit consumer

        Consumer<Integer> c = new Consumer<Integer>() {
            public void accept(Integer t) {
                System.out.println("anonymous class value: " + t);
            }
        };
        list.forEach(c);

        // ----------------------------------------------------------------------------------------------------
        // For each with lambda consumer

        list.forEach((t) -> System.out.println("anonymous class value: " + t));
    }

}

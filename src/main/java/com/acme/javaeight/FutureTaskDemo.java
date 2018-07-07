package com.acme.javaeight;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.stream.IntStream;

public class FutureTaskDemo {

    /**
     * Maximum amount of numbers to check
     */
    private static final int MAX_NUMBER = 999999999;

    /**
     * Returns the amount of numbers that can be divided by the divisor without remainder.
     *
     * @param first   First number to check
     * @param last    Last number to check
     * @param divisor Divisor
     * @return Amount of numbers that can be divided by the divisor without remainder
     */
    private static int amountOfDivisibleBy(int first, int last, int divisor) {

        int amount = 0;
        for (int i = first; i <= last; i++) {
            if (i % divisor == 0) {
                amount++;
            }
        }
        return amount;
    }

    /**
     * Returns the amount of numbers that can be divided by the divisor without remainder (using parallel execution).
     *
     * @param first   First number to check
     * @param last    Last number to check
     * @param divisor Divisor
     * @return Amount of numbers that can be divided by the divisor without remainder
     * @throws InterruptedException Thrown eventually
     * @throws ExecutionException   Thrown eventually
     */
    private static int amountOfDivisibleByFuture(final int first, final int last, final int divisor)
        throws InterruptedException, ExecutionException
    {

        int threadNum = 8;

        ExecutorService executor = Executors.newFixedThreadPool(threadNum);
        List<FutureTask<Integer>> taskList = new ArrayList<>();

        IntStream.range(0, threadNum).forEach((i) -> {
            FutureTask<Integer> futureTask_1 = new FutureTask<>(
                () -> FutureTaskDemo.amountOfDivisibleBy(first, last / threadNum, divisor)
            );
            taskList.add(futureTask_1);
            executor.execute(futureTask_1);
        });

        // Wait until all results are available and combine them at the same time
        int amount = taskList.stream().map((t) -> {
            try {
                return t.get();
            } catch (Exception e) {
                return 0;
            }
        }).reduce((a, b) -> a + b).orElse(0);

        executor.shutdown();

        return amount;
    }

    /**
     * Executing the example.
     *
     * @param args Command line arguments
     * @throws ExecutionException   Thrown eventually
     * @throws InterruptedException Thrown eventually
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // Sequential execution
        long timeStart = Calendar.getInstance().getTimeInMillis();
        int result = FutureTaskDemo.amountOfDivisibleBy(0, MAX_NUMBER, 3);
        long timeEnd = Calendar.getInstance().getTimeInMillis();
        long timeNeeded = timeEnd - timeStart;
        System.out.println("Result         : " + result + " calculated in " + timeNeeded + " ms");

        // Parallel execution
        long timeStartFuture = Calendar.getInstance().getTimeInMillis();
        int resultFuture = FutureTaskDemo.amountOfDivisibleByFuture(0, MAX_NUMBER, 3);
        long timeEndFuture = Calendar.getInstance().getTimeInMillis();
        long timeNeededFuture = timeEndFuture - timeStartFuture;
        System.out.println("Result (Future): " + resultFuture + " calculated in " + timeNeededFuture + " ms");
    }
}
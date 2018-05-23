package com.java8.advtopic;

import java.util.Random;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class Complete
{

    public static void main(String args[]) {

        ExecutorService executor = Executors.newCachedThreadPool();

        /*CompletableFuture<?> future = (CompletableFuture<?>) executor.submit(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                int in= random.nextInt(4000);
                System.out.println("Thread Starting");
                try {
                    Thread.sleep(in);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });*/

        CompletableFuture<?> future = (CompletableFuture<?>) executor.submit(() -> {

                Random random = new Random();
                int in= random.nextInt(4000);
                System.out.println("Thread Starting");
                try {
                    Thread.sleep(in);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        });

        //future.

    }
}

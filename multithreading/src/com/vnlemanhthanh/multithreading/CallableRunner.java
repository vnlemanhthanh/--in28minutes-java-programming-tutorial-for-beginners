/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.multithreading;

import java.util.concurrent.*;

class CallableTask implements Callable<String> {

    private String name;

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(3000);
        return "Hello " + name;
    }
}

public class CallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<String> wellcomeFuture = executor.submit(new CallableTask("vnlemanhthanh"));
        System.out.println("new CallableTask(\"vnlemanhthanh\") executed");
        String wellcomeMessage = wellcomeFuture.get();
        System.out.println(wellcomeMessage);

        System.out.println("Main completed successfully");
    }
}

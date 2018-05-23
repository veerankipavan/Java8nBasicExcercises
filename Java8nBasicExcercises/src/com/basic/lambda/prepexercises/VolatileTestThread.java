package com.basic.lambda.prepexercises;

class VolatileTestThread extends Thread {

     boolean keepRunning = true;

    public void run() {
        while (keepRunning) {
        }

        System.out.println("Thread terminated.");
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileTestThread t = new VolatileTestThread();
        t.start();
        Thread.sleep(1000);
        t.keepRunning = false;
        System.out.println("keepRunning set to false.");
    }
}

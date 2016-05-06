package io.test;

public class Cruiser implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread(new Cruiser());
        a.start(); //throw InterruptedException
        a.run();
        System.out.print("Begin");
        a.join();
        System.out.print("End");
    }
    
    public void run() {
        System.out.print("Run");
    }
}
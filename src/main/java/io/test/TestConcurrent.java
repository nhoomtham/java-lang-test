package io.test;

public class TestConcurrent {
	
	public void waitForSomething() {
        Object o = new Object();
        synchronized (o) {
            // o.wait();
            o.notify();         
        }
    }
	
    private static void book() {
        System.out.print("book");
    }
    
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1);
        book();
    }
}

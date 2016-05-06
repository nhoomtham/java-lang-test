package io.test;

public class TestPropertiesWithoutThis {     
    private int a = 10;
    
    public void doStuff(int a) {
        a += 1;
        System.out.println(++a);
    }
    public static void main(String args[]) {
        TestPropertiesWithoutThis t = new TestPropertiesWithoutThis();
        t.doStuff(3);
    }
}
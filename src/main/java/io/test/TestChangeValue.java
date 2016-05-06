package io.test;

public class TestChangeValue {
    private Integer value = 1;
    
    public Integer getValue() {
        return value;
    }
    
    public void changeVal(Integer value) {
        value = new Integer(3);
    }
    
    static int x[];
    
//    static {
//        x[0] = 1;
//    }
    // Exception in thread "main" java.lang.ExceptionInInitializerError

    public static void main(String args[]) {
        Integer a = new Integer(2);
        TestChangeValue c = new TestChangeValue();
        c.changeVal(a);
        System.out.print(a);
        
        
    }
}
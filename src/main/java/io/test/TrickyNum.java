package io.test;

public class TrickyNum<X extends Object> {
    
    private X x;
    
    public TrickyNum(X x) {
        this.x = x;
    }
    
    private double getDouble() {
        return ((Double) x).doubleValue();
    }
    
    public static void main(String args[]) {
        TrickyNum<Integer> a = new TrickyNum<Integer>(new Integer(1));
        System.out.print(a.getDouble());
        
        /*
          	Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.Double
				at io.swagger.api.impl.TrickyNum.getDouble(TrickyNum.java:12)
				at io.swagger.api.impl.TrickyNum.main(TrickyNum.java:17)

         */
    }
}
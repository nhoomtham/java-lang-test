package io.test;

class Parent {
	protected static int count = 0;
	public Parent() {
		count++;
	}
	
	static int getCount() {return count;}
}

public class Child extends Parent {
	public Child() {
		count++;
	}
	public static void main(String[] args){
		System.out.println(getCount());
		Child c = new Child();
		System.out.println(getCount());
		
		Class cls = c.getClass();
		try {
			System.out.println(cls.getMethod("getNumber", null).toString());
			System.out.println(cls.getDeclaredMethod("getNumber", Integer.class).toString());
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getNumber() {
		// TODO Auto-generated method stub
		// ProcessBuilder p = new ProcessBuilder("");
		
		int x = 5;
//		x = !x;
		x = x >>1;
		x = ~x;

	}
}

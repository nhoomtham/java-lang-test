package io.test;

import java.util.Collections;
import java.util.LinkedList;

import static java.lang.Math.E;

public class TestJava7 {
	private int value = 1;

	public int getValue() {
		return value;
	}

	public void changeVal(int value) {
		value = value;
		System.out.println("this.value:"+this.value);
		System.out.println("changeVal(value):"+value);
	}

	public static void book(short a) {
		System.out.print("short ");
	}

	public static void book(Short a) {
		System.out.print("SHORT ");
	}

	public static void book(Long a) {
		System.out.print("LONG ");
	}

	public static boolean isEmpty(String s) {
		return (s == null | s.length() == 0); // not like "||", '|' will do every condition.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1 = 1.2f;
		double n2 = 0.2f;
		System.out.println(n1 / n2 == 6);
		System.out.println(n1 / n2);

		double es = 0.000001f;
		System.out.println((n1 / n2 - 6) < es);
		System.out.println((n1 / n2 - 6));

		System.out.println((new Float(-2.0).compareTo(-0.0f)));

		System.gc();
		Runtime.getRuntime().gc();

		// exam 1
		LinkedList<String> list = new LinkedList<String>();
		list.add("BbB1");
		list.add("bBb2");
		list.add("bbB3");
		list.add("BBb4");
		Collections.sort(list);
		for (String str : list) {
			System.out.print(str + ":");
		}
		System.out.println();

		// exam 2
		Object myObj = new String[] { "one", "two", "three" };
		{
			for (String s : (String[]) myObj)
				System.out.print(s + ".");
		}
		System.out.println();

		// exam 3
		short shortRoom = 1;
		int intRoom = 2;

		book(shortRoom);
		// book(intRoom); << compilation failure
		System.out.println();

		// exam 4
		Util.State state = Util.State.INACTIVE;

		// exam 5
		TestJava7 tj = new TestJava7();
		tj.changeVal(4);
		System.out.println("local value unassigh to method with unqualify this.: " + tj.value);

		// exam 6
		System.out.println("test string empty null with \"|\" opration");
//		if (isEmpty(null)) {
//			System.out.print("empty ");
//		} else {
//			System.out.print("not_empty ");
//		}
		/*
		 * Exception in thread "main" java.lang.NullPointerException
		 * 
		 */
		
		
		// exam 7
		System.out.println(Math.E);
		System.out.printf("Pi = %f and E = %b \n", Math.PI, Math.E);
		
		// exam 8
		int i = 10;
		while (i++ <= 10) {
			i++;
		}
		System.out.println(i); //13
		
		// exam 9
		System.out.println(Boolean.valueOf("TrUe") ? "true" : "false"); // it uses equalsIgnoreCase 
		System.out.println(Boolean.valueOf("false") ? "true" : "false"); 
	}
	
	public void book() { synchronized(Cruiser.class) {} }
	// public void book1() {synchronized(a){}} // compile failure a undefined
	public synchronized void book2() {}
	// void book3() { synchronized () {} } // compile failure no class param
	// private synchronized TestJava7 a;
	// public synchronized(this) void book4() {} // Syntax error on token "synchronized", AnnotationName expected after this token

}

package io.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;

import com.sun.jersey.server.impl.model.parameter.multivalued.StringReaderFactory;

class A{
	public A() {
		// TODO Auto-generated constructor stub
	}
	
	class B{
		public B() {
			// TODO Auto-generated constructor stub
		}
	}
	
}


// cannot do this
//class C extends A.B{
//	public C() {
//		// TODO Auto-generated constructor stub
//	}
//}

interface I1{
	String name = "n";
	String s1 = "s";
}
interface I2 extends I1{
	String name = "n2";
	
}

class C2 implements I2{
	public void testExc() throws IOException{
		
	}
}

class c3 extends C2{
	public void testExc(){
		
	}
}

public class IkmTest {

//	Character c = new Character("c");
//	Integer inte = new Integer();
	Double d = new Double("12.4d");
	Float f = new Float(23.30);
	Boolean bl = new Boolean("false");
	
	int data;
	{
		System.out.println("init data!!");
		data = 10;
	}

	static int num2 = getValue();
	static int num1 = 10;
	static int getValue(){
		return num1;
	}
	
	public static void main(String[] args) {
		
		System.out.println(num1 + num2); // 10
		System.out.println(num1 - num2); // 10
		
		int ii = 1; int jj = 4;
		int ans = ii = 5;
		System.out.println(ans + ":" + ii + jj + ":" + (13%8)); // 5
		
		new IkmTest();
		IkmTest x = new IkmTest();
		
		System.out.println(((I2) new C2()).name);
		
		final int data = 1;
		
		String f = "file";
		File fl = new File(f);
		fl.renameTo(fl);
		
		try {
			new FileOutputStream(fl);
			OutputStream os = new FileOutputStream(fl);
			new FileInputStream(fl);
			Reader fr = new FileReader(fl);
			// new RandomAccessFile(fl, mode);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String st1 = "st test";
		String st2 = "st test";
		System.out.println(st1.equals(st2));
		System.out.println(st1.matches(st2));
		System.out.println(st1.hashCode() == st2.hashCode());
		System.out.println(st1 == st2); //true

		//System.out.println(String.format("%1$", Calendar.getInstance()));
		//System.out.println(String.format("%tT", Calendar.getInstance().toString()));
		System.out.println(String.format("%tT", Calendar.getInstance()));
		System.out.println(String.format("%tH", Calendar.getInstance()));
		System.out.println(String.format("%tM", Calendar.getInstance()));
		System.out.println(String.format("%tS", Calendar.getInstance()));
		System.out.println(String.format("%1$B", Calendar.getInstance()));
		
		// Calendar.getInstance().roll(field, amount);
		
		System.out.println(Math.nextUp(10.22));
		System.out.println(Math.floor(10.99));
		System.out.println(Math.random());
		System.out.println(Math.nextAfter(10.22, 0.01));
		System.out.println(Math.round(10.55));
		
		Long i = new Long(10);
		long j = 10;
		System.out.println(i.equals(j));
		
	}
}

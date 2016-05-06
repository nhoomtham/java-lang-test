package io.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HashTest {

	private String str;

	public HashTest(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return this.str;
	}

	public static void main(String args[]) {
		HashTest h1 = new HashTest("2");
		String s1 = new String("1");

		List<Object> list = new LinkedList<Object>();
		list.add(h1);
		list.add(s1);

		// Collections.sort(list); //Bound mismatch: The generic method
		// sort(List<T>) of type Collections is not applicable for the arguments
		// (List<Object>).
		for (Object o : list) {
			System.out.print(o + " ");
		}

		Collections.reverse(list);

		Iterator iter = list.iterator();

		// for (Object o : iter) {
		// iter cannot use this way, it should use this way "for (Iterator iterator = list.iterator(); iterator.hasNext();) {"
		// 		System.out.print(o + " ");
		// }
		
        Object arr[] = new Object[2];
        arr[0] = h1;
        arr[1] = s1;
        Arrays.sort(arr); // Exception in thread "main" java.lang.ClassCastException: io.test.HashTest cannot be cast to java.lang.String
        for (Object o : arr) {
            System.out.print(o + " ");
        }

	}
}
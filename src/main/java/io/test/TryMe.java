package io.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class TryMe {
    public static void main(String args[]) {
        Queue<String> q = new PriorityQueue<String>();
        q.add("3");
        q.add("1");
        q.add("2");
        System.out.print(q.poll() + " ");
        System.out.print(q.peek() + " ");
        System.out.print(q.peek());
        System.out.println();
        
        HashMap<String, Integer> hm = new HashMap<>();
        Set<String> x = hm.keySet();
        Collection<Integer> y = hm.values();
        
//        System.getProperties().getProperty("");
//        System.getProperty("");
//        System.getenv("");
//        System.load("");

        String test = "This is a test string";
        String[] tokens = test.split("\\s");
        System.out.println(tokens.length);
        
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2009);
        c.set(Calendar.MONTH, 6);
        c.set(Calendar.DAY_OF_MONTH, 1);
        String formattedDate = df.format(c.getTime());
        System.out.println(formattedDate);
    }
}
package io.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerialization implements Serializable {
	// private transient Room room = new Room(); // always pass as transient will not be serialized
    private volatile Room room = new Room(); // runtime error if object not serialized
    
    public static void main(String[] args) {
        TestSerialization h = new TestSerialization();
        try {
            FileOutputStream fos = new FileOutputStream("Hotel.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(h);
            oos.close();
        } catch(NullPointerException | ArrayIndexOutOfBoundsException | IOException ex) {
            ex.printStackTrace();
        }
    }
}

// class Room{
class Room implements Serializable {
}
package io.test;

class Hotelin {
    public int bookings;
    public void book() {
        bookings++;
    }
}

public class SuperHotel extends Hotelin {
    public void book() {
        bookings--;
    }
    
    public void book(int size) {
        book();
        super.book();
        bookings += size;
    }
    
    public static void main(String args[]) {
    	SuperHotel hotel = new SuperHotel();
        hotel.book(2); // this is using the superclass
        System.out.print(hotel.bookings);
    }
}
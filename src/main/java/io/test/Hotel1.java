package io.test;

public class Hotel1 {
    private int roomNr;
    
    public Hotel1(int roomNr) {
        this.roomNr = roomNr;
    }
    
    public int getRoomNr() {
        return this.roomNr;
    }
    
    static Hotel1 doStuff(Hotel1 hotel) {
        hotel = new Hotel1(1);
        return hotel;
    }
    
    public static void main(String args[]) {
    	Hotel1 h1 = new Hotel1(100);
        System.out.print(h1.getRoomNr() + " ");
        Hotel1 h2 = doStuff(h1);
        System.out.print(h1.getRoomNr() + " ");
        System.out.print(h2.getRoomNr() + " ");
        h1 = doStuff(h2);
        System.out.print(h1.getRoomNr() + " ");
        System.out.print(h2.getRoomNr() + " ");
    }
}
package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: M@N!T
 * Date: 7/17/12
 * Time: 10:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class Book1 {

    boolean availability;
    int num;
    String name;
    public Book1(String n, int no){
        this.name=n;
        this.num=no;
        availability=true;
    }
    public String getName() {
        return this.name;
    }

    public int getNum() {
        return this.num;
    }

    public boolean getAvail() {
        return this.availability;
    }

    public void reserve() {
        if(this.getAvail())
        {
            this.setAvail(false);
            System.out.println("Enjoy the book. Thank You");
        }
        else
            System.out.println("Book is not available");

    }

    public void setAvail(boolean b) {
        this.availability=b;
    }
}

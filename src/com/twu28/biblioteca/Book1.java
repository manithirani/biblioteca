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

    public boolean isAvailable()
    {
        return this.availability;
    }
    private void setAvailability(boolean b){
        this.availability=b;
    }

    public boolean reserve() {
        if(this.isAvailable())
        {
            this.setAvailability(false);
            System.out.println("Enjoy the book. Thank You");
            return true;
        }
        else
        {
            System.out.println("Sorry, we don't have that book yet.");
            return false;
        }

    }

}

package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: M@N!T
 * Date: 7/25/12
 * Time: 10:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class Movie {

    String name;
    double rating;
    String director;
    public Movie(String n, String dir, double r)
    {
        this.name=n;
        this.director=dir;
        this.rating=r;
    }

    public String getName() {
        return this.name;
    }

    public String getDirector() {
        return this.director;
    }

    public double getRating() {
        return this.rating;
    }
}

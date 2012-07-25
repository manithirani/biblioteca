package com.twu28.biblioteca;

import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: M@N!T
 * Date: 7/25/12
 * Time: 10:21 AM
 * To change this template use File | Settings | File Templates.
 */
public class MovieTest extends TestCase {

    public void testMovieShouldHaveAName() throws Exception {
        Movie m=new Movie("XYZ","John Doe",8.9);
        assertEquals("XYZ",m.getName());
    }

    public void testMovieShouldHaveADirector() throws Exception {
        Movie m=new Movie("XYZ","John Doe",8.9);
        assertEquals("John Doe",m.getDirector());
    }

    public void testMovieShouldHaveARating() throws Exception {
        Movie m=new Movie("XYZ","John Doe",8.9);
        assertEquals(8.9,m.getRating());
    }
}

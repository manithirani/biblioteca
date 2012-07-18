package com.twu28.biblioteca;

import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: M@N!T
 * Date: 7/17/12
 * Time: 11:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryTest extends TestCase {
    public void testshouldDisplayBooks() throws Exception {
      assertTrue(new Library().displayBooks());
    }

    public void testreserveBook() throws Exception {
      assertTrue(new Library().reserveBook(3));
    }

    public void testdisplayMessageLibraryNumber() throws Exception {
        assertTrue(new Library().checkLibraryNumber());
    }

}

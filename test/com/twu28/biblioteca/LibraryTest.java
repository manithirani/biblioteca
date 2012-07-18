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
    public void testShouldDisplayBooks() throws Exception {
        Library lib=new Library();
      assertTrue(lib.displayBooks());
    }
   public void testShouldBeReservedIfAvailable() throws Exception {
       Library lib=new Library();
        assertTrue(lib.reserveBook(2));
    }

    public void testShouldNotBeAvailableIfReserved() throws Exception {
        Library lib=new Library();
        lib.reserveBook(4);
        assertFalse(lib.reserveBook(4));
    }

    public void testShouldGetNullIfNoBookExists() throws Exception {
        Library lib=new Library();
         assertNull(lib.getBook(7));
    }

    public void testShouldGetNotNullIfBookExists() throws Exception {
        Library lib=new Library();
        assertNotNull(lib.getBook(2));
    }

    public void testShouldGetNullIfIndexOutOfRange() throws Exception {
        Library lib=new Library();
        assertNull(lib.getBook(16));
    }

    public void testDisplayMessageLibraryNumber() throws Exception {
        Library lib=new Library();
        assertTrue(lib.checkLibraryNumber());
    }
}

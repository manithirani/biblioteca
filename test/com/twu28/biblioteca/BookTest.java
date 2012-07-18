package com.twu28.biblioteca;

import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: M@N!T
 * Date: 7/17/12
 * Time: 10:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookTest extends TestCase {

    public void testBookShouldHaveAName() throws Exception {
        Book1 book=new Book1("XYZ",1);
        assertEquals("XYZ",book.getName());

    }
    public void testBookShouldHaveANumber() throws Exception {
        Book1 book=new Book1("XYZ", 1);
        assertEquals(1 ,book.getNum());

    }
    public void testBookShouldBeAvailableWhenCreated() throws Exception {
        Book1 book=new Book1("XYZ", 1);
        assertTrue(book.isAvailable());

    }

    public void testShouldBeReservedWhenAvailable() throws Exception {
        Book1 book=new Book1("XYZ", 1);
        assertTrue(book.reserve());
    }

    public void testBookShouldNotBeAvailableWhenReserved() throws Exception {
        Book1 book=new Book1("XYZ", 1);
        book.reserve();
        assertFalse(book.isAvailable());

    }


}

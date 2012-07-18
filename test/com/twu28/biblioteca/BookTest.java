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

    public void testbookShouldHaveAName() throws Exception {
        Book1 book=new Book1("XYZ",1);
        assertEquals("XYZ",book.getName());

    }
    public void testbookShouldHaveANumber() throws Exception {
        Book1 book=new Book1("XYZ", 1);
        assertEquals(1 ,book.getNum());

    }
    public void testbookShouldBeAvailableWhenCreated() throws Exception {
        Book1 book=new Book1("XYZ", 1);
        assertTrue(book.getAvail());

    }
    public void testbookShouldNotBeAvailableWhenReserved() throws Exception {
        Book1 book=new Book1("XYZ", 1);
        book.reserve();
        assertFalse(book.getAvail());

    }


}

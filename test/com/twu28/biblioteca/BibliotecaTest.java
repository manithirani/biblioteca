package com.twu28.biblioteca;

import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: M@N!T
 * Date: 7/13/12
 * Time: 9:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class BibliotecaTest extends TestCase {
    public void testoptionChoiceNo1() throws Exception {
        assertEquals(1, new Biblioteca().optionChoice(1));
    }
    public void testoptionChoiceNo2() throws Exception {
        assertEquals(2, new Biblioteca().optionChoice(2));
    }
    public void testoptionChoiceNo3() throws Exception {
        assertEquals(3, new Biblioteca().optionChoice(3));
    }
    public void testdisplayBooks() throws Exception {
        assertEquals(1, new Biblioteca().displayBooks());
    }
    public void testfirstBookIsAvailable() throws Exception {
        assertEquals(1, new Biblioteca().checkAvailability(1));
    }
    public void testsecondBookIsAvailable() throws Exception {
        assertEquals(1, new Biblioteca().checkAvailability(2));
    }
    public void testthirdBookIsAvailable() throws Exception {
        assertEquals(1, new Biblioteca().checkAvailability(3));
    }
    public void testfourthBookIsAvailable() throws Exception {
        assertEquals(1, new Biblioteca().checkAvailability(4));
    }
    public void testfifthBookIsAvailable() throws Exception {
        assertEquals(1, new Biblioteca().checkAvailability(5));
    }


}

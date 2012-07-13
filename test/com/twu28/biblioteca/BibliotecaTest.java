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
}

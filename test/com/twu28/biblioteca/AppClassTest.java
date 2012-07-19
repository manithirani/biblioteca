package com.twu28.biblioteca;

import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: M@N!T
 * Date: 7/19/12
 * Time: 7:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class AppClassTest extends TestCase {

    public void testDisplayMenu() throws Exception {
            AppClass app=new AppClass();
            assertTrue(app.displayMenu());
    }

    public void testShouldReturnOneForChoiceOne() throws Exception {
           AppClass app=new AppClass();
           Library l=new Library();
           assertEquals(1,app.resolveChoice(l,1));
    }

    /*public void testShouldReturnTwoForChoiceTwo() throws Exception {
        AppClass app=new AppClass();
        Library l=new Library();
        assertEquals(2,app.resolveChoice(l,2));
    }        */

    public void testShouldReturnThreeForChoiceThree() throws Exception {
        AppClass app=new AppClass();
        Library l=new Library();
        assertEquals(3,app.resolveChoice(l,3));
    }

    public void testShouldReturnFourForChoiceFour() throws Exception {
        AppClass app=new AppClass();
        Library l=new Library();
        assertEquals(4,app.resolveChoice(l,4));
    }

    public void testShouldReturnZeroForInvalidChoice() throws Exception {
        AppClass app=new AppClass();
        Library l=new Library();
        assertEquals(0,app.resolveChoice(l,9));
    }

    /*public void testShouldExitAppAfterRun() throws Exception {
         AppClass app=new AppClass();
        assertTrue(app.RunApp());
    } */
}

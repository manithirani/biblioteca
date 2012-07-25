package com.twu28.biblioteca;

import junit.framework.TestCase;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

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
           assertEquals(1,app.resolveChoice(l,1,System.in));
    }

    public void testShouldReturnTwoForChoiceTwo() throws Exception {
        AppClass app=new AppClass();
        Library l=new Library();
        String str="2";
        InputStream is = new ByteArrayInputStream(str.getBytes());
        assertEquals(2,app.resolveChoice(l,2,is));
    }

    public void testShouldReturnThreeForChoiceThree() throws Exception {
        AppClass app=new AppClass();
        Library l=new Library();

        assertEquals(3,app.resolveChoice(l,3,System.in));
    }

    public void testShouldReturnFourForChoiceFour() throws Exception {
        AppClass app=new AppClass();
        Library l=new Library();
        assertEquals(4,app.resolveChoice(l,4,System.in));
    }

    public void testShouldReturnFiveForChoiceFive() throws Exception {
        AppClass app=new AppClass();
        Library l=new Library();
        assertEquals(5,app.resolveChoice(l,5,System.in));
    }

    public void testShouldReturnZeroForInvalidChoice() throws Exception {
        AppClass app=new AppClass();
        Library l=new Library();
        assertEquals(0,app.resolveChoice(l,9,System.in));
    }

    /*public void testShouldExitAppAfterRun() throws Exception {
         AppClass app=new AppClass();
        String str="3\n2\n1\n4\n";
        InputStream is = new ByteArrayInputStream(str.getBytes());
        assertTrue(app.RunApp(is));
    } */
}

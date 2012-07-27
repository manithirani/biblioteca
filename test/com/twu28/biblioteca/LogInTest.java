package com.twu28.biblioteca;

import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: M@N!T
 * Date: 7/27/12
 * Time: 11:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class LogInTest extends TestCase {


    public void testShouldLogInForCorrectCombo() throws Exception {
        LogIn l=new LogIn();
        assertTrue(l.checkLogIn("111-1111", "pwd1"));
    }
    public void testLoginShouldFailForInvalidPwd(){
        LogIn l=new LogIn();
        assertFalse(l.checkLogIn("111-1111","pwdwrong"));
    }
    public void testLoginShouldFailForInvalidNum(){
        LogIn l=new LogIn();
        assertFalse(l.checkLogIn("111-1234","pwd123"));
    }
}

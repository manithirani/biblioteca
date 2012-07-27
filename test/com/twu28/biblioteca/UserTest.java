package com.twu28.biblioteca;

import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: M@N!T
 * Date: 7/27/12
 * Time: 1:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserTest extends TestCase {

    public void testShouldLoginUser() throws Exception {
        User u=new User("XYZ","pwd");
        assertTrue(u.userLogin("XYZ","pwd"));
    }

    public void testFailedLoginInvalidUname() throws Exception {
        User u=new User("XYZ","pwd");
        assertFalse(u.userLogin("ABC","pwd"));
    }

    public void testFailedLoginInvalidPwd() throws Exception {
        User u=new User("XYZ","pwd123");
        assertFalse(u.userLogin("XYZ","pwd"));
    }
}

package com.twu28.biblioteca;

import sun.net.idn.StringPrep;

/**
 * Created with IntelliJ IDEA.
 * User: M@N!T
 * Date: 7/27/12
 * Time: 11:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class User {

    String uName;
    String pwd;

    public User(String u, String p){

        this.uName=u;
        this.pwd=p;
    }

    public boolean userLogin(String u, String p) {
        if(this.uName.equals(u)&&this.pwd.equals(p))
                return true;
        else
                return false;
    }

    public String getUname() {
        return uName;
    }
}

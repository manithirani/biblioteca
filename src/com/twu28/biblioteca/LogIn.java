package com.twu28.biblioteca;

import java.io.Console;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: M@N!T
 * Date: 7/27/12
 * Time: 11:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class LogIn {

    User[] userList=new User[5];
    int userNum;
    int userLen;
    boolean loginStatus;
    public LogIn(){
        this.userList[0]=new User("111-1111","pwd1");
        this.userList[1]=new User("111-1112","pwd2");
        this.userList[2]=new User("111-1113","pwd3");
        this.userList[3]=new User("111-1114","pwd4");
        this.userList[4]=new User("111-1115","pwd5");
        this.userLen=5;
        loginStatus=false;
    }

    public boolean getLogInDetails(){
        System.out.println("LOG-IN");
        System.out.println("Enter username:");
        Scanner s=new Scanner(System.in);
        String uName=s.nextLine();
        System.out.println("Enter password:");
        String pwd=s.nextLine();
        return (checkLogIn(uName,pwd));
    }

    public boolean checkLogIn(String name, String passWord)
    {
        for(int i=0;i<this.userLen;i++)
        {
            if((this.userList[i].userLogin(name, passWord)))
            {
                this.loginStatus=true;
                this.userNum=i+1;
                return true;
            }
        }
        return false;

    }

    public boolean getLogInStatus(){
        return this.loginStatus;
    }

    public int getUserNum(){
        return this.userNum;
    }

    public String getUname(){
        return this.userList[this.userNum-1].getUname();
    }

}

package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: M@N!T
 * Date: 7/19/12
 * Time: 7:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class AppClass {
    public boolean displayMenu() {
        System.out.println("MENU");
        System.out.println("1. View books");
        System.out.println("2. Reserve book");
        System.out.println("3. Check Library Number");
        System.out.println("4. Exit");
        System.out.println("Enter your choice...");
        return true;
    }

    public int getChoice(InputStream i) throws IOException {
        InputStreamReader isr=new InputStreamReader(i);
        BufferedReader br=new BufferedReader(isr);
        String x=br.readLine();
        System.out.println(x);
        int y= Integer.parseInt(x);
        return y;
    }

    public int resolveChoice(Library l,int choice, InputStream i) throws IOException {
        System.out.println("Choice is "+choice);
       if(choice==1)
       {
           l.displayBooks();
           return 1;
       }
        if(choice==2)
        {
            l.displayBooks();
            System.out.println("Enter book number to reserve");
            int bnum=getChoice(i);
            l.reserveBook(bnum);
            return 2;
        }
        if(choice==3)
        {
            l.checkLibraryNumber();
            return 3;
        }
        if(choice==4)
        {
            System.out.println("Thank you for using this application");
            return 4;
        }
            System.out.println("Select a valid option!");
            return 0;

    }

    public boolean RunApp(InputStream i) throws IOException {
        int choice;
        Library lib=new Library();

        do{
            displayMenu();
            choice=getChoice(i);
            resolveChoice(lib,choice,i);

        }while(choice!=4);
        System.out.println("Application exited.");
        return true;
    }

}

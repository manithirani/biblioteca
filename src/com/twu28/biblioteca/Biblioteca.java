package com.twu28.biblioteca;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created with IntelliJ IDEA.
 * User: M@N!T
 * Date: 7/12/12
 * Time: 7:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class Biblioteca {


    public static void main(String args[]) throws IOException {
        int choice=0;
        Library l=new Library();
        do{
            System.out.println("MENU");
            System.out.println("1. View books");
            System.out.println("2. Reserve book");
            System.out.println("3. Check Library Number");
            System.out.println("4. Exit");
            System.out.println("Enter your choice...");
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            String x=br.readLine();
            choice=Integer.parseInt(x);
            switch(choice)
            {
                case 1: l.displayBooks();
                        break;
                case 2: l.displayBooks();
                        System.out.println("Enter book number to reserve");
                        String y=br.readLine();
                        int bnum=Integer.parseInt(y);
                        l.reserveBook(bnum);
                        break;
                case 3: l.checkLibraryNumber();
                        break;
                case 4: System.out.println("Thank you for using the application.");
                        break;

            }
           }while(choice!=4);
        System.out.println("Application exited");
    }
}

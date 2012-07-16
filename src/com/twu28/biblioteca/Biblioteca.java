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

        int status[]={1,1,0,1,0};
        String names[]={"Bruce","Alfred","Gordon","Dent","Fox"};
        int libnum[]={127,528,491,500,123};
        public int optionChoice(int ch) throws IOException {

            if(ch==1||ch==2||ch==3||ch==4)
                  return ch;
            else
            {
                System.out.println("Select a Valid Option!");
                return 0;
            }


        }
        public int displayBooks()
        {
            System.out.println("1. Kane and Abel");
            System.out.println("2. The Best Laid Plans");
            System.out.println("3. Paths of Glory");
            System.out.println("4. The Doomsday Conspiracy");
            System.out.println("5. The Prodigal Daughter");

            return 1;
        }
        public int checkAvailability(int opt)
        {
              if(status[opt-1]==1)
                  return 1;
              else
                  return 0;
        }
    public int reserveBooks() throws IOException {
        System.out.println("1. Kane and Abel");
        System.out.println("2. The Best Laid Plans");
        System.out.println("3. Paths of Glory");
        System.out.println("4. The Doomsday Conspiracy");
        System.out.println("5. The Prodigal Daughter");
        System.out.println("Enter the number for reserving the book:");
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader b=new BufferedReader(r);
        String x= b.readLine();
        int bookChoice=Integer.parseInt(x);
        if(checkAvailability(bookChoice)==1)
        {
            status[bookChoice-1]=0;
            System.out.println("Thank you. Enjoy the book!");
            return 1;
        }
        else
        {
            System.out.println("Sorry. We don't have that book yet.");
            return 0;
        }

    }
    public int libraryNumber(String name)
    {
        int index=-1;
        for(int i=0;i<5;i++)
        {
            if(name.equals(names[i]))
                index=i;
        }
        if(index==-1)
        {
            System.out.println("Name not found");
            return 0;
        }
        System.out.println("Library Number is "+libnum[index]);
        System.out.println("Please talk to the librarian. Thank you");
        return 1;
    }
    public static void main(String args[]) throws IOException {
        int sel;
        System.out.println("Welcome!");
        do{
            System.out.println();
            System.out.println("LIBRARY MENU");
           System.out.println("1. View books.");
           System.out.println("2. Reserve books.");
           System.out.println("3. Check number.");
           System.out.println("4. Exit application.");
           System.out.println("Choose an option....");
            InputStreamReader re=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(re);
            String z= br.readLine();
            sel=Integer.parseInt(z);
            switch(sel)
            {
                case 1:  new Biblioteca().displayBooks();
                         break;
                case 2:  new Biblioteca().reserveBooks();
                         break;
                case 3:  System.out.println("Enter your name:");
                         InputStreamReader rea=new InputStreamReader(System.in);
                         BufferedReader bre=new BufferedReader(rea);
                         String y= bre.readLine();
                         new Biblioteca().libraryNumber(y);
                         break;
                case 4:   System.out.println("Thank you for using the application.");
                          break;
                default:  System.out.println("Select a Valid Option!");
            }
        }while(sel!=4);
        System.out.println("Application exited.");
    }
}

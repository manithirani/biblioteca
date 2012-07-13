package com.twu28.biblioteca;
import java.io.IOException;


/**
 * Created with IntelliJ IDEA.
 * User: M@N!T
 * Date: 7/12/12
 * Time: 7:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class Biblioteca {

        int status[]={1,1,1,1,1};
        public int optionChoice(int ch) throws IOException {

            if(ch==1||ch==2||ch==3)
                  return ch;
            else
            {
                System.out.println("Select a Valid Option!");
                return 0;
            }


        }
        public int displayBooks()
        {
            System.out.println("1. Book1");
            System.out.println("2. Book2");
            System.out.println("3. Book3");
            System.out.println("4. Book4");
            System.out.println("5. Book5");

            return 1;
        }
        public int checkAvailability(int opt)
        {
              if(status[opt-1]==1)
                  return 1;
              else
                  return 0;
        }

}

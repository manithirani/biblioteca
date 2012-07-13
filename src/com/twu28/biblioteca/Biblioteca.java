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

        public int optionChoice(int ch) throws IOException {

            if(ch==1||ch==2||ch==3)
                  return ch;
            else
            {
                System.out.println("Select a Valid Option!");
                return 0;
            }


        }
}

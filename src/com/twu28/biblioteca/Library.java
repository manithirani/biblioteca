package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: M@N!T
 * Date: 7/17/12
 * Time: 11:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Library {
    Book1[] bookList=new Book1[10];
    int len;
    public Library(){
        this.bookList[0]=new Book1("Book 1", 1);
        this.bookList[1]=new Book1("Book 2", 2);
        this.bookList[2]=new Book1("Book 3", 3);
        this.bookList[3]=new Book1("Book 4", 4);
        this.bookList[4]=new Book1("Book 5", 5);
        this.len=5;


    }
    public boolean displayBooks() {
        System.out.println("List of books:");
        for(int i=0;i<this.len;i++)
        {
           System.out.println(this.bookList[i].getNum()+"---"+this.bookList[i].getName());
        }
        return true;
    }

    public boolean reserveBook(int bookNum) {
        Book1 bookChoice=this.getBook(bookNum);
        return bookChoice.reserve();
    }

    public Book1 getBook(int ref){
        for(int i=0;i<this.len;i++)
        {
            if(this.bookList[i].getNum()==ref)
                return this.bookList[i];
        }
        return null;
    }

    public boolean checkLibraryNumber() {
        System.out.println("Please talk to the librarian. Thank you.");
        return true;
    }
}

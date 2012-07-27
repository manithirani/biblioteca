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
    Movie[] movies=new Movie[15];
    int len;
    int movieLen;
    public Library(){
        this.bookList[0]=new Book1("Book 1", 1);
        this.bookList[1]=new Book1("Book 2", 2);
        this.bookList[2]=new Book1("Book 3", 3);
        this.bookList[3]=new Book1("Book 4", 4);
        this.bookList[4]=new Book1("Book 5", 5);
        this.len=5;
        this.movies[0]=new Movie("The Dark Knight Rises","Christopher Nolan",10.0);
        this.movies[1]=new Movie("The Social Network","David Fincher",9.8);
        this.movies[2]=new Movie("Titanic","James Cameron",9.6);
        this.movies[3]=new Movie("Memento","Christopher Nolan",10.0);
        this.movies[4]=new Movie("Fightclub","David Fincher",9.7);
        this.movies[5]=new Movie("Avatar","James Cameron",7.0);
        this.movies[6]=new Movie("The Dark Knight","Christopher Nolan",10.0);
        this.movies[7]=new Movie("Se7en","David Fincher",9.4);
        this.movies[8]=new Movie("Pulp Fiction","Quentin Tarantino",9.7);
        this.movies[9]=new Movie("Inception","Christopher Nolan",10.0);
        this.movies[10]=new Movie("Reservoir Dogs","Quentin Tarantino",9.1);
        this.movies[11]=new Movie("The Prestige","Christopher Nolan",9.8);
        this.movies[12]=new Movie("Barfi!","Anurag Basu",-1);
        this.movies[13]=new Movie("Django Unchained","Quentin Tarantino",-1);
        this.movies[14]=new Movie("Andaz Apna Apna","Rajkumar Santoshi",9.9);
        this.movieLen=15;
    }
    public boolean displayBooks() {
        System.out.println("List of books:");
        for(int i=0;i<this.len;i++)
        {
           System.out.println(this.bookList[i].getNum()+"---"+this.bookList[i].getName());
        }
        return true;
    }
    public Boolean displayMovies(){
        System.out.println("List of Movies:");
        for(int i=0;i<this.movieLen;i++)
        {
            System.out.print((i+1)+"--"+this.movies[i].getName()+"--"+this.movies[i].getDirector()+"--");
            double r=this.movies[i].getRating();
            if(r==-1)
                System.out.print("N/A");
            else
                System.out.print(r);
            System.out.println();
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

    public boolean checkLibraryNumber(LogIn l) {
        if(l.getLogInStatus())
        {
            int pos=l.getUserNum();
            System.out.println("Your library number is "+l.getUname());
        }
        else
            System.out.println("Please talk to the librarian. Thank you.");

        return true;
    }
}

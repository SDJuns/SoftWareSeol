import java.util.*;
/**
 * 여기에 Borrower 클래스 설명을 작성하십시오.
 * 
 * @author (2018315009 황훈태, 2018315025 신동준, 2018315031 박성현) 
 * @version (2019-11-28)
 */
public class Borrower
{
    private String name;
    private LinkedList<Book> borrowedBooks;
<<<<<<< HEAD
    private Book book; 

    publoic Borrwer(String name){
=======
    private Book book;
    
    public Borrower(String name){
>>>>>>> 57abc4df9d77c3ce0f89aee3d47bf2c9b12f292a
        this.name = name;
    }

    public void attachBook(Book book){
        this.book = book;
    }

    public void detachBook(Book book){
        this.book = null;
    } 

    public String getName(){
        return this.name;
    }
    
    public Book getBook(Book book){
        return this.book;
    }

    public Book getBook(){
        return this.book;
    }
}
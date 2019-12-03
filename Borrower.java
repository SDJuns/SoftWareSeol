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
    private Book book; 

    publoic Borrwer(String name){
        this.name = name;
 
    }

    public void attachBorrower(Borrower borower){
        this.book = book;
    }

    public void detachBorrower(Borrower borrower){
        this.book = null;
    } 

    public void findBorrower(String name){

    }

    public void attachBook(Book book){
        this.book = book;
    }

    public void detachBorrower(Book book){
        this.book = null;
    } 

    public String getName(){
        return this.name;
    }
    
    public Book getBook(Book book){
        return this.book;
    }

    public void findborrower(String name){
    }
}
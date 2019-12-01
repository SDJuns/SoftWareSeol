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
=======
<<<<<<< HEAD
    private Book book;
    public Borrower(String name,Book book){
=======

>>>>>>> e33b205c47988e5f08594e9a6c105e361f0ee3e4


    public Borrower(String name){
>>>>>>> 3fb19f1acd90df24ba5f694554485e10bea40a2e
        this.name = name;
<<<<<<< HEAD
=======
        this.book = book;
        borrowedBooks = new LinkedList<Book>();
    }
    
    public void attachBorrower(Borrower borower){
        this.book = book;
    }

    public void detachBorrower(Borrower borrower){
        this.book = null;
    } 
    
    public void findBorrower(String name){
>>>>>>> e33b205c47988e5f08594e9a6c105e361f0ee3e4
        
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
    
    
    public void findborrower(String name){
        
    }

}
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
    public Borrower(String name,Book book){



    }
    public Borrower(String name){

        this.name = name;
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
        
    }
    
    
    
    public void findborrower(String name){
        
    }

}
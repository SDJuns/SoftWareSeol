import java.util.*;
/**
 * 여기에 Borrower 클래스 설명을 작성하십시오.
 * 
 * @author (2018315009 황훈태, 2018315025 신동준, 2018315031 박성현) 
 * @version (버전번호나 날짜)
 */
public class Borrower
{
    private String name;
    private LinkedList<Book> borrowedBooks;
    private Borrower borrower;
    private Book book;

    public Borrower(String name){
        this.name = name;
        borrowedBooks = new LinkedList<Book>();
    }
    
    public void attachBorrower(Borrower borower){
        this.borrower = borrower;
    }

    public void detachBorrower(Borrower borrower){
        this.borrower = null;
    } 
    
    public void findBorrower(String name){
        
    }
    
    
    
    public void findborrower(String name){
        
    }

}
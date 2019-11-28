import java.util.*;
/**
 * 여기에 Borrower 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Borrower
{
    private String name;
    private LinkedList<Book> borrowedBooks;

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
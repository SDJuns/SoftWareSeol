import java.util.*;
import java.lang.*;
/**
 * 여기에 Book 클래스 설명을 작성하십시오.
 * 
 * @author (2018315009 황훈태, 2018315025 신동준, 2018315031 박성현) 
 * @version (2019-11-28)
 */
public class Book implements Comparable<Book>
{
    private int catalogueNumber;
    private String author;
    private String title;
    private Borrower borrower = null;
    private String rsvBorrowerName = null;
    int a = 0;

    public Book(String title, String author, int catalogueNumber){
        this.title = title;
        this.author = author;
        this.catalogueNumber = catalogueNumber;
    }

    public void display(){
        System.out.println("Title :" + title);
        System.out.println("Author :" + author);
        System.out.println("catalogue Numer: " + catalogueNumber);
    }
    
    public void returndate(){
        System.out.println("반납일은 대출일로부터 2주 뒤 입니다.");
    }

    public void attachBorrower(Borrower borrower){
        this.borrower = borrower;
    }

    public void detachBorrower(Borrower borrower){
        this.borrower = null;
    } 

    public int getCatalogueNumber(){
        return this.catalogueNumber;
    }

    public Borrower getBorrower(){
        return this.borrower;
    }

    public int compareTo(Book book) {
        return (this.catalogueNumber - book.catalogueNumber);
    }

    public Borrower getborrower(){
        return this.borrower;
    }

    public void ReservationattachBorrower(String name){
        this.rsvBorrowerName = name;
    }

    public String getRsvBorrowerName(){
        return this.rsvBorrowerName;
    }

    public void rsvDisplay(){
        if((rsvBorrowerName != null)){
            System.out.println("예약중인 책입니다.");
        }
        else{
            System.out.println("예약가능한 책입니다.");
        }
    }
}

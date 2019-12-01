import java.util.*;
/**
 * 여기에 Book 클래스 설명을 작성하십시오.
 * 
 * @author (2018315009 황훈태, 2018315025 신동준, 2018315031 박성현) 
 * @version (버전번호나 날짜)
 */
public class Book
{
    private int catalogueNumber;
    private String author;
    private String title;
    private Borrower borrower;
    
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
    
    
    public int getcatalogueNumber(){
        return this.catalogueNumber;
    }

    public void findbook(int catalogueNumber){
        
    }
    
    public Borrower getBorrower(){
        return this.borrower;
    }
    
}

import java.util.*;
/**
 * 여기에 Book 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Book
{
    private int catalogueNumber;
    private String author;
    private String title;

    private Borrower borrower;
<<<<<<< HEAD

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

    public void attachBorrower(Borrower borower){
        this.borrower = borrower;
    }

    public void detachBorrower(Borrower borrower){
        this.borrower = null;
=======
    public Book(String title,String author, int catalogueNumber)
    {
        this.title = title;
        this.author = author;
        this.catalogueNumber = catalogueNumber;
>>>>>>> cfee9ee7d13db2dc1ec2a746c597dd452e5a6778
    }
    
<<<<<<< HEAD
    public int getcatalogueNumber(){
        return this.catalogueNumber;
=======
    public void display()
    {
        System.out.println("Title :" + title);
        System.out.println("author :" + author);
        System.out.println("catalogueNumber :" + catalogueNumber);
>>>>>>> cfee9ee7d13db2dc1ec2a746c597dd452e5a6778
    }
    
<<<<<<< HEAD
    public Borrower getBorrower(){
        return borrower;
=======
    public void attachBorrower(Borrower borrower)
    {
        this.borrower = borrower;
>>>>>>> cfee9ee7d13db2dc1ec2a746c597dd452e5a6778
    }
<<<<<<< HEAD

=======
    
    public void dettachBorrower(Borrower borrower)
    {
        this.borrower = null;
    }
    
    public int getcatalogueNumber()
    {
        return this.catalogueNumber;
    }
    
    public Borrower getBorrower()
    {
        return borrower;
    }
    
    
>>>>>>> cfee9ee7d13db2dc1ec2a746c597dd452e5a6778
}

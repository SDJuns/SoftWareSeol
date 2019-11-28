
/**
 * 여기에 Book 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Book
{
    private String title;
    private String author;
    private int catalogueNumber;
    private Borrower borrower;
    public Book(String title,String author, int catalogueNumber)
    {
        this.title = title;
        this.author = author;
        this.catalogueNumber = catalogueNumber;
    }
    
    public void display()
    {
        System.out.println("Title :" + title);
        System.out.println("author :" + author);
        System.out.println("catalogueNumber :" + catalogueNumber);
    }
    
    public void attachBorrower(Borrower borrower)
    {
        this.borrower = borrower;
    }
    
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
    
    
}

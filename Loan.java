
/**
 * 여기에 Loan 클래스 설명을 작성하십시오.
 * 
 * @author (2018315009 황훈태, 2018315025 신동준, 2018315031 박성현) 
 * @version (2019-11-28)
 */
public class Loan
{
    private String Returndate;
    private Book book;
    private Borrower borrower;
    
   
    
    public Loan(Book book, Borrower borrower){
        this.book = book;
        this.borrower = borrower;
    }
    
    public void returndate(){
        
    }
    
    public Book getBook(){
        return this.book;
    }
    
    public Borrower getBorrower(){
        return this.borrower;
    }
    
    
}

import java.util.*;
/**
 * 여기에 ClassIS 클래스 설명을 작성하십시오.
 * 
 * @author (2018315009 황훈태, 2018315025 신동준, 2018315031 박성현) 
 * @version (버전번호나 날짜)
 */
public class Library
{
    private String name;
    private TreeSet<Book> registeredBooks;
    private HashSet<Borrower> registeredBorrowers;
    private LinkedList<Loan> registeredLoans;

    public Library(String name){
        this.name = name;
        registeredBooks = new TreeSet<Book>();
        registeredBorrowers = new HashSet<Borrower>();
    }

    public void registerOneBorrower(String name){
        Borrower borrower = new Borrower(name);
        registeredBorrowers.add(borrower);
    }

    public void registerOneBook(String title, String author, int catalogueNumber){
        Book book = new Book(title, author, catalogueNumber);
        registeredBooks.add(book);
    }

    //Loan객체와 관련이 있는지 물어보기
    //관련있으면 보여주기 없으면 안보여주기
    public void displayBooksOnLoan(){
        Iterator it = registeredBooks.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            if((book.getBorrower())==null){
                book.display();
            }
            else{
                book.display();
            }
        }
    }
    
    public void displayBooksForLoan(){
        Iterator it = registeredBooks.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            if((book.getBorrower())==null){
                
            }
            else{
                book.display();
            }
        }
    }
    
    

    public void LeadOneBook(String name, int catalogueNumber){
        Book book = book.findBook(catalogueNumber);
        Borrower borrower = book.findBorrower(name);
        Loan loan = new Loan(book, borrower);
        registeredLoans.add(loan);
        
    }

    public void returnOneBook(int catalogueNumber){
        Book book = this.findBook(catalogueNumber);
        Loan loan = this.findLoan(book);
        loan.clear();
    }
    
}

    

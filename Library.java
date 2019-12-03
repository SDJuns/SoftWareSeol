import java.util.*;
import java.lang.*;
/**
 * 여기에 ClassIS 클래스 설명을 작성하십시오.
 * 
 * @author (2018315009 황훈태, 2018315025 신동준, 2018315031 박성현) 
 * @version (2019-11-28)
 */
public class Library 
{
    private String name;
    private TreeSet<Book> registeredBooks;
    private HashSet<Borrower> registeredBorrowers;
    private HashSet<Loan> registeredLoans;
    private Book book;
    private Borrower borrower;
    private Loan loan;

    public Library(){
        // this.name = name;
        registeredBooks = new TreeSet<Book>();
        registeredBorrowers = new HashSet<Borrower>();
        registeredLoans = new HashSet<Loan>();
    }

    public void registerOneBorrower(String name){
        Borrower borrower = new Borrower(name);
        System.out.println(borrower.getName());
        registeredBorrowers.add(borrower);
        System.out.println("사용자 등록이 완료되었습니다.");
    }

    public void registerOneBook(String title, String author, int catalogueNumber){
        Book book = new Book(title, author, catalogueNumber);
        book.compareTo(book);
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
        Iterator itbook = registeredBooks.iterator();
        while(itbook.hasNext()){
            Book book = (Book)itbook.next();
            if((book.getCatalogueNumber() == catalogueNumber)){
                this.book= book;
                break;
            }
        }

        Iterator itborrower = registeredBorrowers.iterator();
        while(itborrower.hasNext()){
            System.out.println("들어감");
            Borrower borrower = (Borrower)itborrower.next();
            if(name.equals(borrower.getName())){
                this.borrower = borrower;
                System.out.println("대출중입니다.");
                System.out.println(this.borrower.getName());
                break;
            }
        }
        
        if(this.book!=null && this.borrower!=null){
            if(this.book.getborrower() == null && this.borrower.getBook() == null) {
                Loan loan = new Loan(book, borrower);
                registeredLoans.add(loan);
                this.book.attachBorrower(this.borrower);
                this.borrower.attachBook(this.book);
                System.out.println("등록 완료");
                //loan.returndate();
            }
        }
        else if(this.book==null){
            System.out.println("책을 찾을 수 없습니다.");
        }
        else if(this.borrower==null){
            System.out.println("이용자를 찾을 수 없습니다.");
        }

    }

    public void returnOneBook(int catalogueNumber){
        Iterator it = registeredBooks.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            if(book.getCatalogueNumber() == catalogueNumber){
                this.book = book;
                System.out.println("책찾음" + this.book.getCatalogueNumber());
                break;
            }
        }

        Iterator it2 = registeredLoans.iterator();
        while(it2.hasNext()){
            Loan loan = (Loan)it2.next();
            if(loan.getBorrower() == this.book.getBorrower()){
                System.out.println("들어왔나");
                this.loan = loan;
                this.book.detachBorrower(this.loan.getBorrower());
                this.loan.getBorrower().detachBook(this.book);
                System.out.println("반납 완료");
                break;
            }
        }

        if(this.book==null){
            System.out.println("책을 찾을 수 없습니다.");
        }
        if(this.borrower==null){
            System.out.println("이용자를 찾을 수 없습니다.");
        }

    }
}


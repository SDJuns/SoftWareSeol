import java.util.*;
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
        Iterator it = registeredBooks.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            if((book.getCatalogueNumber() == catalogueNumber)){
                Book findedbook = book;
                break;
            }
        }
        

        Iterator it2 = registeredBorrowers.iterator();
        while(it2.hasNext()){
            Borrower borrower = (Borrower)it2.next();
            if((borrower.getName() == name)){
                Borrower findedborrower = borrower;
                break;
            }
        }

        if(findedbook!=null && findedborrower!=null){
            if(book.getborrower() == null && borrower.getbook() == null) {
                Loan loan = new Loan(book, borrower);
                book.attachBorrower(borrower);
                borrower.attachBook(book);
                loan.returndate();
            }
        }
        else if(book==null){
            System.out.println("책을 찾을 수 없습니다.");
        }
        else if(borrower==null){
            System.out.println("이용자를 찾을 수 없습니다.");
        }

        add.registeredLoans(loan);

    }

    public void returnOneBook(int catalogueNumber, String name){
        Iterator it3 = registeredBooks.iterator();
        while(it3.hasNext()){
            Book book = (Book)it3.next();
            if(book.getCatalogueNumber() == catalogueNumber){
                
                
            }
        }
        
        Iterator it = registeredBorrowers.iterator();
        while(it.hasNext()){
            Borrower borrower = (Borrower)it.next();
            if((borrower.getName() == name)){

                break;
            }
        }
        
        if(book!=null && borrower!=null){
            if(book.getborrower() == null && borrower.getbook() == null) {
                book.attachBorrower(borrower);
                borrower.attachBook(book);
                loan.returndate();
            }
        }
        else if(book==null){
            System.out.println("책을 찾을 수 없습니다.");
        }
        else if(borrower==null){
            System.out.println("이용자를 찾을 수 없습니다.");
        }
    }
}
<<<<<<< HEAD
=======

>>>>>>> e4ffe41ff2401f1ed22174d951073c095de1ba97

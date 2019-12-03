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
    private Boolean check = false;
    private Boolean RSV = false; 
    private TreeSet<Book> registeredBooks;
    private HashSet<Borrower> registeredBorrowers;
    private HashSet<Loan> registeredLoans;
    private HashSet<Reservation> resgiteredReservations;
    private Book book;
    private Borrower borrower;
    private Loan loan;

    public Library(){
        registeredBooks = new TreeSet<Book>();
        registeredBorrowers = new HashSet<Borrower>();
        registeredLoans = new HashSet<Loan>();
        resgiteredReservations = new HashSet<Reservation>();
    }

    public void registerOneBorrower(String name){
        Iterator itborrower = registeredBorrowers.iterator();
        while(itborrower.hasNext()){
            Borrower borrower = (Borrower)itborrower.next();
            if(name.equals(borrower.getName())){
                this.check = true;
            }
        }
        if(this.check == false){
            Borrower borrower = new Borrower(name);
            registeredBorrowers.add(borrower);
            System.out.println("사용자 등록이 완료되었습니다.");
        }
        else if(this.check == true){
            System.out.println("이미 등록된 사용자 입니다.");
            check = false;
        }
    }

    public void registerOneBook(String title, String author, int catalogueNumber){
        Book book = new Book(title, author, catalogueNumber);
        book.compareTo(book);
        registeredBooks.add(book);
    }

    //Loan객체와 관련이 있는지 물어보기
    //관련있으면 보여주기 없으면 안보여주기
    public void displayBooksForLoan(){
        Iterator it = registeredBooks.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            if((book.getBorrower())==null && book.getRsvBorrowerName()==null){
                book.display();
                System.out.println();
            }
            else{
                
            }
        }
    }

    public void displayBooksOnLoan(){
        Iterator it = registeredBooks.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            if((book.getBorrower())==null){
                
            }
            
            else{
                book.display();
                book.rsvDisplay();
            }
        }
    }

    public void LeadOneBook(String name, int catalogueNumber){
        Iterator itbook = registeredBooks.iterator();
        while(itbook.hasNext()){
            Book book = (Book)itbook.next();
            if((book.getCatalogueNumber() == catalogueNumber)){
                this.book = book;
                break;
            }
        }

        Iterator itborrower = registeredBorrowers.iterator();
        while(itborrower.hasNext()){
            Borrower borrower = (Borrower)itborrower.next();
            if(name.equals(borrower.getName())){
                this.borrower = borrower;
                System.out.println(this.borrower.getName());
                break;
            }
        }

        if(this.book!=null && this.borrower!=null){
            if(this.book.getborrower() == null && this.borrower.getBook() == null) {
                Loan loan = new Loan(book, borrower);
                registeredLoans.add(loan);
                this.book.attachBorrower(loan.getBorrower());
                this.borrower.attachBook(loan.getBook());
                System.out.println("********************");
                System.out.println("대출자 : " + this.borrower.getName());
                System.out.println("책 정보");
                this.book.display();
                System.out.println("\n대출 등록 완료되었습니다.");
                book.returndate();
                System.out.println("********************");
            }
        }
        else if(this.book==null){
            System.out.println("책을 찾을 수 없습니다.");
        }
        else if(this.book.getBorrower() != null){
            System.out.println("이미 대출중인 책입니다.");
        }
        else if(this.borrower==null){
            System.out.println("이용자를 찾을 수 없습니다.");
        }
        else if(this.borrower.getBook() != null){
            System.out.println("이미 책을 대출하셨습니다.");
        }
    }

    public void returnOneBook(int catalogueNumber){
        Iterator itbook = registeredBooks.iterator();
        while(itbook.hasNext()){
            Book book = (Book)itbook.next();
            if(book.getCatalogueNumber() == catalogueNumber){
                this.book = book;
                break;
            }
        }

        Iterator itloan = registeredLoans.iterator();
        while(itloan.hasNext()){
            Loan loan = (Loan)itloan.next();
            if(loan.getBorrower() == this.book.getBorrower()){
                System.out.println("****************"); 
                System.out.println("책을 반납합니다. "); 
                this.loan = loan;
                this.loan.getBook().detachBorrower(this.loan.getBorrower());
                this.loan.getBorrower().detachBook(this.loan.getBook());
                registeredLoans.remove(this.loan);
                System.out.println("반납 완료되었습니다.");
                System.out.println("****************"); 
                break;
            }
        }
        if(this.book==null){
            System.out.println("책을 찾을 수 없습니다.");
        }
    }

    public void reservation(String name, int catalogueNumber){
        Iterator itloan = registeredLoans.iterator();
        while(itloan.hasNext()){
            Loan loan = (Loan)itloan.next();
            if((loan.getBook().getCatalogueNumber() == catalogueNumber) && loan.getReservation() == null){
                Reservation reservation = new Reservation(name, catalogueNumber);

                book.ReservationattachBorrower(reservation.getName());
                borrower.ReservationattachBorrower(reservation.getCatalogueNumber());
                loan.ReservationattachReservation(reservation);

                resgiteredReservations.add(reservation);
                RSV = true;
            }
        }
        if(this.RSV == true){
            System.out.println("예약이 완료되었습니다.");
            this.RSV = false;
        }
        else if(this.RSV == false){
            System.out.println("대출중인 책이 아니거나 등록된 책이 아닙니다.");
        }
    }
}


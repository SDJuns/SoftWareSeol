import java.util.*;
import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class MyApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyApp extends JFrame
{
    public static void main(String[] args)
    {
        Library li = new Library();
        System.out.println("******** 도서관 프로그램 ********");
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);
        boolean pro = true;
        while(pro){
            System.out.println("0. 종료");
            System.out.println("1. 사용자 등록");
            System.out.println("2. 서적 등록");
            System.out.println("3. 대출가능서적 출력");
            System.out.println("4. 대출 중 서적 출력");
            System.out.println("5. 대출");
            System.out.println("6. 반납");
            System.out.println("7. 예약\n");
            System.out.println("선택하시오(0~7)");
            int select = scanner.nextInt();
            if(select == 0){
                pro = false;
            }
            else if(select == 1){
                System.out.print("사용자의 이름을 입력하시오 : ");
                String name = scanner.next();
                li.registerOneBorrower(name);
            }
            else if(select == 2){
                System.out.print("책 이름을 입력하세요 : ");
                String title = scanner.next();
                System.out.print("책 저자를 입력하세요 : ");
                String author = scanner.next();
                System.out.print("책 고유번호를 입력하세요 : ");
                int catalogueNumber = scanner.nextInt();
                li.registerOneBook(title, author, catalogueNumber);
            }
            else if(select == 3){
<<<<<<< HEAD
                System.out.println("대출가능한 책을 출력합니다. \n");
                li.displayBooksForLoan();
=======
                System.out.println("****************"); 
                System.out.println("대출가능한 책을 출력합니다.");
                li.displayBooksForLoan();
                System.out.println("****************"); 
>>>>>>> 4c425e5599ec363d60c44b00e71ffee16b08a9dd
            }
            else if(select == 4){
<<<<<<< HEAD
                System.out.println("대출중인 책을 출력합니다. \n");
                li.displayBooksOnLoan();
=======
                System.out.println("****************"); 
                System.out.println("대출중인 책을 출력합니다.");
                li.displayBooksOnLoan();
                System.out.println("****************"); 
>>>>>>> 4c425e5599ec363d60c44b00e71ffee16b08a9dd
            }
            else if(select == 5){
<<<<<<< HEAD
                System.out.println("사용자의 이름을 입력해 :");  
=======
                System.out.print("사용자의 이름을 입력하세요 : ");  
>>>>>>> 4c425e5599ec363d60c44b00e71ffee16b08a9dd
                String title = scanner.next();
                System.out.print("책 고유번호를 입력하세요 : ");
                int catalogueNumber = scanner.nextInt();
                li.LendOneBook(title,catalogueNumber);
            }
            else if(select == 6){
                System.out.print("책 고유번호를 입력하세요 : ");
                int catalogueNumber = scanner.nextInt();
                li.returnOneBook(catalogueNumber);
            }
            else if(select == 7){
                System.out.print("사용자의 이름을 입력하세요 : ");
                String name = scanner.next();
                System.out.print("책 고유번호를 입력하세요 : ");
                int catalogueNumber = scanner.nextInt();
                li.reservation(name, catalogueNumber);
            }
        }

    }
    
}

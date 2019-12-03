import java.util.*;
/**
 * Write a description of class MyApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyApp
{
    public static void main(String[] args)
    {

        Library li = new Library();
        System.out.println("******** 도서관 프로그램 ********");
        System.out.println("\n\n");

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
            System.out.println("\n");
            System.out.println("선택하시오(0~6)");
            int select = scanner.nextInt();
            if(select == 0){
                pro = false;
            }
            else if(select == 1){
                System.out.println("사용자의 이름을 입력하시오 : ");
                String name = scanner.next();
                li.registerOneBorrower(name);
            }
            else if(select == 2){
                System.out.println("책이름을 입력하세요 : ");
                String title = scanner.next();
                System.out.println("책저자를 입력하세요 : ");
                String author = scanner.next();
                System.out.println("책 고유번호를 입력하세요 : ");
                int catalogueNumber = scanner.nextInt();
                li.registerOneBook(title, author, catalogueNumber);
            }
            else if(select == 3){
                System.out.println("대출가능한 책을 출력합니다. \n");
                li.displayBooksOnLoan();
            }
            else if(select == 4){
                System.out.println("대출중인 책을 출력합니다. \n");
                li.displayBooksForLoan();
            }
            else if(select == 5){
                System.out.println("사용자의 이름을 입력해 ");  
                String title = scanner.next();
                System.out.println("책 고유번호를 입력하세요 : ");
                int catalogueNumber = scanner.nextInt();
                li.LeadOneBook(title,catalogueNumber);
            }
            else if(select == 6){
                System.out.println("책을 반납합니다. "); 
                System.out.println("책 고유번호를 입력하세요 : ");
                int catalogueNumber = scanner.nextInt();
                li.returnOneBook(catalogueNumber);
            }
        }

    }
}


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
        li.registerOneBook("책", "박성현", 1234);
        li.displayBooksOnLoan();
        
        li.registerOneBook("책2", "박성현1", 123455);
        li.displayBooksOnLoan();
        
        li.registerOneBook("책3", "박성현2", 123466);
        li.displayBooksOnLoan();
    }
}

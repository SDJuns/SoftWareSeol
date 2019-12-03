
/**
 * 여기에 Reservation 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Reservation
{
    private String name;
    private int catalogueNumber;
    
    public Reservation(String name, int catalogueNumber){
        this.name = name;
        this.catalogueNumber = catalogueNumber;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getCatalogueNumber(){
        return this.catalogueNumber;
    }
    
    
}


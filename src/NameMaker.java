
import java.util.Scanner;


public class NameMaker {
   
    
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        
        
       String firstName = sc.next();
       String middleName = sc.next();
       String lastName = sc.next();
       
       String fullName = (firstName + " " + middleName + " " + lastName);
        System.out.println("Nome completo: " + fullName);
        sc.close();
    }
    
}

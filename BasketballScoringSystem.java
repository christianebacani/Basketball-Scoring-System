//Basketball Scoring System
// Created by : Christiane A.  Bacani
import java.util.Scanner;

public class BasketballScoringSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Basketball Scoring System");
        
        while (true) {
            System.out.print("Home: ");
            String home = input.nextLine();
            
            System.out.print("Visitors : ");
            String visitors = input.nextLine();
            
            if (home.equals("") && visitors.equals("")) {
                break;
            }
            
        }
    }        
}

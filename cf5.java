//A. Elephant
//ek sathe 5 step chali shake chhe to kyaare te bdha steps pura kari dese te print karavvanu
import java.util.Scanner;
public class cf5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int fullSteps = x / 5; 
        int remainder = x % 5;  
        if (remainder > 0) {
            fullSteps++;
        }
        System.out.println(fullSteps);
    }
}


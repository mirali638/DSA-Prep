//A. Bit++
// Operation ++ increases the value of variable x by 1.
// Operation -- decreases the value of variable x by 1.
import java.util.Scanner;
public class cf6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        scanner.nextLine();  
        int x = 0; 
        for (int i = 0; i < n; i++) {
            String operation = scanner.nextLine(); 
            if (operation.contains("++")) {
                x++; // Increment x
            } else if (operation.contains("--")) {
                x--; // Decrement x
            }
        }
        System.out.println(x);
    }
}

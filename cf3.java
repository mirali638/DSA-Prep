//Watermelon
//if we divide watermalon in w parts check this parts is even or odd.
import java.util.Scanner;
public class cf3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int w = scanner.nextInt();
            if (w > 2 && w % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    } 

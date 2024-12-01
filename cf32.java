//A. Calculating Function
//f(n) =  - 1 + 2 - 3 + .. + ( - 1)nn
//Your task is to calculate f(n) for a given integer n.
import java.util.Scanner;
public class cf32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        scan.close();
        System.out.println((num %2==0) ? (num/2) : -((num+1)/2));
    }
}
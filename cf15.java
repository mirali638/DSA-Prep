//A. Required Remainder
//You are given three integers x,y and n. Your task is to find the maximum integer k
// such that 0≤k≤n that kmodx=y
import java.util.Scanner;
public class cf15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(); 
            int y = sc.nextInt(); 
            int n = sc.nextInt(); 
            // Find the largest m such that (m * x + y) <= n
            int m = (n - y) / x;
            int k = m * x + y;
            System.out.println(k);
        }
    }
}

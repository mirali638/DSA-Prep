//A. Elections
//Given the votes of three candidates, find the number of additional votes each of the two candidates 
//needs to win against the third candidate with the maximum votes.
import java.util.Scanner;
public class cf40{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long A = Math.max(0, Math.max(b, c) - a + 1);
            long B = Math.max(0, Math.max(a, c) - b + 1);
            long C = Math.max(0, Math.max(a, b) - c + 1);
            System.out.println(A + " " + B + " " + C);
    }
}}
//Given a two-digit positive integer n, find the sum of its digits.
//A. A+B Again?
// given 77 then output must be 14
import java.util.Scanner;

public class cf9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            int number = sc.nextInt();
            int sum =0;
            while(number>0){
                sum += number%10;
                number /= 10;
            }
            System.out.println(sum);
        } 
    }
}

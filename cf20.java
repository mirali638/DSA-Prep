//A. Sum
//You are given three integers a, b, and c. Determine if one of them is the sum of the other two.
import java.util.Scanner;
public class cf20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a+b==c) {System.out.println("YES");}
            else if(a+c==b) {System.out.println("YES");}
            else if(b+c==a) {System.out.println("YES");}
            else{ System.out.println("NO");}
        }
    }
}

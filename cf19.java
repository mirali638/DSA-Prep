//A. Marathon
// You are given four distinct integers a,b,c, d
// Timur and three other people are running a marathon. The value a is the distance that Timur has run and b, c, d
//  correspond to the distances the other three participants ran.
// Output the number of participants in front of Timur.
import java.util.Scanner;
public class cf19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int count=0;
            if(a<b) count++;
            if(a<c) count++;
            if(a<d) count++;
            System.out.println(count);
        }
    }
}

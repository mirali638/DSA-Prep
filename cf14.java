//A. Stair, Peak, or Neither?
//You are given three digits a, b, and c. Determine whether they form a stair, a peak, or neither.
//A stair satisfies the condition a<b<c
//A peak satisfies the condition a<b>c

import java.util.Scanner;
public class cf14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        //sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if (a < b && b < c) {
                System.out.println("STAIR");
            } else if (a < b && b > c) {
                System.out.println("PEAK");
            } else {
                System.out.println("NONE");
            }
        }
    }
}

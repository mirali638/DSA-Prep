//A. Plus or Minus
//You are given three integers a ,b and c
//such that exactly one of these two equations is true:
//a+b=c
//a−b=c
//Output + if the first equation is true, and - otherwise.
import java.util.Scanner;
public class cf16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        //sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a+b==c){
                System.out.println("+");
            }else{
                System.out.println("-");
            }
        }
    }
}
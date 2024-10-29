//minimize
//You are given two integers a and b (a≤b). Over all possible integer values of c (a≤c≤b), 
//find the minimum value of (c−a)+(b−c)
import java.util.*;
public class cf1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            sc.nextLine();
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(y-x);

        }
    }
}
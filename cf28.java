//letter code forces ma aave che ke nay te check karvanu
//A. Codeforces Checking
import java.util.*;
public class cf28 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            char ch = sc.nextLine().charAt(0);
            String s = "codeforces";
            if(s.contains(String.valueOf(ch))){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}

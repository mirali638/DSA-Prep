//A. Love Story
//ek string hoi tene biji badhi string saathe compare karvani and check karvanu ke ketli index ma changes chhe 
//banne ni lenth same j hase 
//mirali chhe to mitali sathe monali sathe manali sathe check karvanu 
//answer 1,2,2 aave 
import java.util.*;
public class cf12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s1 = "codeforces";
            String s2 = sc.nextLine();
            int diff=0;
            for(int j=0;j<s1.length();j++){
                if(s1.charAt(j)!=s2.charAt(j)){
                    diff++;
                }  
            }
            System.out.println(diff);
        }
    }
}

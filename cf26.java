//A. Translation
//2 strings aapel hase check krvanu ke biji string pela ni reverse chhe ke nai
import java.util.*;
public class cf26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        StringBuilder s1 = new StringBuilder(s);
        String rev = s1.reverse().toString();
        if(rev.equals(t)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}

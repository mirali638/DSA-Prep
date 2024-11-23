// 2 strings aapel che same length n ni tene compare krvani case ignore krvana and joavnu kai moti chhe ne kai nani
//A. Petya and Strings
import java.util.*;
public class cf23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int res = s1.compareToIgnoreCase(s2);
        if(res==0) System.out.println("0");
        if(res<0) System.out.println("-1");
        if(res>0) System.out.println("1");
    }
}

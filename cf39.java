//B. Different String
//You are given a string s consisting of lowercase English letters.Rearrange the characters of s to form a new string r
//that is not equal to s, or report that it's impossible.
import java.util.Arrays;
import java.util.Scanner;
public class cf39{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String t = new String(ch);
            if(s.equals(t)){
                int j = 1;
                //for checking same character
                while (j < ch.length && ch[j] == ch[0]) {
                    j++;
                }
                // If a different character is found, swap it with the first one
                if (j < ch.length) {
                    char temp = ch[0];
                    ch[0] = ch[j];
                    ch[j] = temp;
                    String r = new String(ch);
                    System.out.println("YES");
                    System.out.println(r);
                } else {
                    System.out.println("NO");
                }
            }else {
                System.out.println("YES"); 
                System.out.println(t);
            }
        }
    }
}
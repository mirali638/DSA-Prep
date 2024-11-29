//ek string aapel hoi tema jo aakhi abcd aavi jati hoi to yes print karavvanu baki no
//A. Pangram
import java.util.*;
public class cf31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.nextLine(); 
        String s = sc.nextLine();  
        Set<Character> letters = new HashSet<>(); 
        for (char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') { 
                letters.add(c); 
            }
        }
        if (letters.size() >= 26) { 
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

//Vlad and the Best of Five
//Vladislav has a string of length 5, whose characters are each either A or B. Which letter appears most 
//frequently: A or B?
import java.util.*;
public class cf35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        List<Character> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            int acount = 0;
            int bcount = 0;
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (ch == 'A') {
                    acount++;
                } else if (ch == 'B') {
                    bcount++;
                }
            }
            if (bcount > acount) {
                results.add('B');
            } else {
                results.add('A'); 
            }
        }
        for (char result : results) {
            System.out.println(result);
        }
    }
}

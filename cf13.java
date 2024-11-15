//A. Square String?
//A string is called square if it is some string written twice in a row. For example, 
//the strings "aa", "abcabc", "abab" and "baabaa" are square. But the strings "aaa", "abaaab" 
//and "abcdabc" are not square.

import java.util.Scanner;
public class cf13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine(); 
            //jo odd number ni length hoi to no
            if (s.length() % 2 != 0) {
                System.out.println("No");
            } else {
                int mid = s.length() / 2;
                String firstHalf = s.substring(0, mid);
                String secondHalf = s.substring(mid);
                if (firstHalf.equals(secondHalf)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}

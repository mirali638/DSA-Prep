//capitalize the given string
//A. Word Capitalization
import java.util.*;
public class cf24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(s1.substring(0,1).toUpperCase()+s1.substring(1));
    }
}

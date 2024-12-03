// You are given an expression of the form a+b, where a and b are integers from 0 to 9. You have to evaluate it and print the result.
//A+B=?
import java.util.*;
public class cf34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] parts = s.split("\\+");
            int res = Integer.parseInt(parts[0].trim()) + Integer.parseInt(parts[1].trim());
            results.add(res); // Store each result
        }
        for (int result : results) {
            System.out.println(result);
        }
    }
}

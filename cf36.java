//Collecting Coins
//3 sisters have a,b,c coins and his brother have n coins 
//brother wants to distribute n coins to his three sisters 
//but the condition is (A+B+C=n), then a+A=b+B=c+C.
//A B C are the number coins after distribution.
import java.util.Scanner;
public class cf36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int n = scanner.nextInt();
            //total coin check karavana jo totalcoi 3 avde divisible hoi to j te disstribute kro sakse
            int totalCoins = a + b + c + n;
            if (totalCoins % 3 == 0) {
                //target number gotvano ke badhi sister pase ketla hova joiae disstribution pachhi
                int target = totalCoins / 3;
                //jem ke target 6 hoi to baddha pase tena krta ochha coin hova joiae
                if (a <= target && b <= target && c <= target) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}

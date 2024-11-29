//A. Again Twenty Five!
//given n mate 5 rest to n sodhvanu and chella 2 digit print karavvana
import java.math.BigInteger;
import java.util.Scanner;
public class cf29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger num1 = scan.nextBigInteger();
        // Calculating 5^num1 % 100 using BigInteger
        BigInteger base = BigInteger.valueOf(5);
        BigInteger mod = BigInteger.valueOf(100);
        // BigInteger's method for power and modulo
        BigInteger result = base.modPow(num1, mod);
        System.out.println(result);
    }
}

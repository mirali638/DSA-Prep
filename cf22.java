//A. Bear and Big Brother
//2 jana na weight aapel chhe ek nu weight varse 3 ganu vadhe chhe and bija nu 2 ganu vadhe chhe
//ketla varsh pachhi a nu weight vadhare thse b karta te check krvanu chhe
import java.util.*;
public class cf22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count=0;
        while(a<=b){
            a *= 3;
            b *= 2;
            count++;
        }
        System.out.println(count);
    }
}

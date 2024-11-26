//A. Nearly Lucky Number
//jo number ma ekla 4 and 7 j hoi to lucky baki nay
import java.math.BigInteger;
import java.util.Scanner;
public class cf27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger num = scan.nextBigInteger();
        scan.close();
        String str = num.toString();
        int count = 0;
        int i4 = 0;
        int i7 = 0;
        for(int i = 0; i<str.length(); i++){
            BigInteger n = num.mod(BigInteger.TEN);
            if(n.equals(BigInteger.valueOf(4))){
                count++;
                i4++;
            }else if(n.equals(BigInteger.valueOf(7))){
                count++;
                i7++;
            }
            num = num.divide(BigInteger.TEN);
        }
       if((count==4 || count==7) ){
        System.out.println("YES");
       }else{
        System.out.println("NO");
       }
    }
}
//A. Lucky?
//A ticket is a string consisting of six digits. A ticket is considered lucky if
 //the sum of the first three digits is equal to the sum of the last three digits. 
 //Given a ticket, output if it is lucky or not. Note that a ticket can have leading zeroes.
import java.util.Scanner;
public class cf18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            String t = sc.nextLine();
            int fhs =0;
            int shs =0;
            for(int j=0;j<3;j++){
                //first half sum
                fhs+=Character.getNumericValue(t.charAt(j));
            }
            for(int j=3;j<6;j++){
                //second half sum
                shs+=Character.getNumericValue(t.charAt(j));
            }
            if(fhs==shs){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }  
        }
    }
}
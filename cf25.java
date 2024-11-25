//aapel string ma jo A vadhare hoi to anton print karavanu jo D vadhare hoi to danik and jo A and D same hoi to 
// friendship print karavvvani
//A. Anton and Danik
import java.util.*;
public class cf25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
            char ch1 = 'A';
            char ch2 = 'D';
            int count1 =0;
            int count2 =0;
            for(int j =0;j<s.length();j++){
                if(s.charAt(j)==ch1){
                    count1++;
                }else{
                    count2++;
                }
            }if(count1==count2){
                System.out.println("Friendship");
            }else if (count1>count2){
                System.out.println("Anton");
            }else{
                System.out.println("Danik");
            }
        }
    }


//A. Division?
// Codeforces separates its users into 4 divisions by their rating:
// For Division 1: 1900≤rating
// For Division 2: 1600≤rating≤1899
// For Division 3: 1400≤rating≤1599
// For Division 4: rating≤1399
// Given a rating, print in which division the rating belongs.
import java.util.Scanner;
public class cf17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        //sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            int r = sc.nextInt();
            if(r>=1900){
                System.out.println("Division 1");
            }else if(1600<=r&&r<=1899){
                System.out.println("Division 2");
            }else if(1400<=r&&r<=1599){
                System.out.println("Division 3");
            }else{
                System.out.println("Division 4");
            }
        }
    }
}
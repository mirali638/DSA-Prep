//A. Minutes Before the New Year
//new year etle ke 00:00 vagvama ketli var chhe
import java.util.Scanner;
public class cf8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        for(int i=0; i<n; i++){
            int hours = sc.nextInt();
            int minutes =  sc.nextInt();
            //ek kalak ma ketli minute baki 
            int minutesRemaining = 60-minutes;
            //24 kalak ma ketli kalak baki 
            int hoursRemaining = 23 - hours;
            //farithi biji kalak mateni minute ganva mate
            if(minutesRemaining==60){
                minutesRemaining=0;
                hoursRemaining++;
            }
            int totalMinutesRemaining = (hoursRemaining*60)+minutesRemaining;
            System.out.println(totalMinutesRemaining);
        }
    }
}

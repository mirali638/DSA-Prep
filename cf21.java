//A. Hulk
//if n =1 print i hate it
//if n=2 print i hate that i love it
//if n= 3 print i hate that i love that i hate it and so on....

import java.util.*;
public class cf21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            if(i%2==0){
               System.out.print("I hate ");
            }else{  
                System.out.print("I love "); 
            }
            if(i<n-1){
                System.out.print("that ");
            }else{
                System.out.print("it");
            }
        }
    }
}

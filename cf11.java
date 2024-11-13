//A. Creating Words
// length 3 ni 2 string aapel hoi cat dog to aapne 
//dat cog krvanu pelo character change karvano bey no 

import java.util.Scanner;
public class cf11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 
        for(int i=0;i<n;i++){
            String s = scanner.next();
            String t = scanner.next();
            char sarr[] = s.toCharArray();
            char tarr[]= t.toCharArray();
            //swap karyu banne na 0th index ne
            char temp =  sarr[0];
            sarr[0]=tarr[0];
            tarr[0]=temp;
            //fari string ma convert kryo array ne
            s=new String(sarr);
            t=new String(tarr);
            System.out.println(s+" "+t);
        }
    }
    

}

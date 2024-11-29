//polyhedron aapel chhe teno total print karavvano
//the total number of faces in all the polyhedrons in Anton's collection.
//A. Anton and Polyhedrons
import java.util.*;
public class cf30 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for(int i=0;i<=n;i++){
            String s = sc.nextLine();
            String s1 = "Tetrahedron";
            String s2 = "Cube";
            String s3 = "Octahedron";
            String s4 = "Dodecahedron";
            String s5 = "Icosahedron";
            if(s.equals(s1)) {sum+=4;}
            if(s.equals(s2)) {sum+=6;}
            if(s.equals(s3)) {sum+=8;}
            if(s.equals(s4)) {sum+=12;}
            if(s.equals(s5)) {sum+=20;} 
        }
        System.out.println(sum);
    }
}
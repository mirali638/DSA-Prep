//A. Vanya and Cubes
// pyramid bnavvano cube no tema sauthi upar na level par ek cube hoi ske and teni niche 1+2=3 teni niche 1+2+3=6 tem sauthi 
// niche na level par 1+2+3..+i cube hova joiae
// t(n)= (n*(n+1))/2 thi javab male
import java.util.Scanner;
public class cf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        //ketla level thya te janva
        int n=0;
        //total cubes ketla thya te janva
        int tc=0;
        while(true){
            //ek ek level vadhartu javanu
            n++;
            //ketla cube umeraya te jovanu
            tc += (n*(n+1))/2;
            //jo total cube ni snkhya vadhi jay to break karvanu
            if(tc>i) {break;}
        }
        //ek level aochu print karavvanu kem k te pehla thi j vadhi gyu hase 
        System.out.println(n-1);
    }
}

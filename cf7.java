//a.word
//word aapel hase jo tema vadhare character uppercase ma hoi to aakha word ne uppercase ma convert karvano and jo vadhare 
//loowercase ma hoi to lower casema convert karvano
import java.util.Scanner;
public class cf7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        //lowercasecount
        int lcc=0;
        //uppercasecount
        int ucc=0;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch)){
                lcc++;
            }
            else{
                ucc++;
            }
        }
        if(lcc>=ucc){
           System.out.println(word.toLowerCase()); 
        }
        else{
            System.out.println(word.toUpperCase()); 
        }
    }
}

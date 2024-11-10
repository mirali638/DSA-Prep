//A. Way Too Long Words
//if word is too long means it has more than 10 letters than minimize it
//print first and last cahracter and in between print the length (numbers of letter) of word.
import java.util.Scanner;
public class cf4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        int n = scanner.nextInt();
        scanner.nextLine();   
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine(); 
            if (word.length() > 10) { 
                System.out.println(word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1));
            } else {
                System.out.println(word);
            }
        }
    }
}


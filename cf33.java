//A. Brain's Photos
//Photo can be represented as a matrix sized n × m, and each element of the matrix stores a symbol indicating corresponding pixel color. 
//There are only 6 colors:
// 'C' (cyan)
// 'M' (magenta)
// 'Y' (yellow)
// 'W' (white)
// 'G' (grey)
// 'B' (black)
//The photo is considered black-and-white if it has only white, black and grey pixels in it. If there are any of cyan, 
//magenta or yellow pixels in the photo then it is considered colored.
import java.util.*;
public class cf33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean isColored = false;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                char pixel =sc.next().charAt(0);
                if (pixel == 'C' || pixel == 'M' || pixel == 'Y') {
                    isColored = true;
                    break;
                }
            }
            if (isColored) break; 
        }
        if (isColored) {
            System.out.println("#Color");
        } else {
            System.out.println("#Black&White");
        }
    }
}
        
      


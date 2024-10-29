//B. osu!mania
//consists of n rows and 4 columns. Because notes at the bottom are closer, you will process the bottommost row first and the topmost row last. Each row will contain exactly one note, represented as a '#'.
//For each note 1,2,…,n, in the order of processing, output the column in which the note appears.
import java.util.Scanner;
  public class cf2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt(); 
            sc.nextLine(); 
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt(); 
                sc.nextLine();
                //jetli row hoi etli size no array bnavvo pade # no number store krva mate
                int[] result = new int[n];
                for (int j = 0; j < n; j++) {
                    String row = sc.nextLine();
                    for (int k = 0; k < 4; k++) {
                        if (row.charAt(k) == '#') {
                            result[j] = k + 1; 
                            break;
                        }
                    }
                }
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(result[j] + " ");
                }
                System.out.println();
            }
        }
    }
     


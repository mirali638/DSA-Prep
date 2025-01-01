//Blank Space
// You are given a binary array a of n elements, a binary array is an array consisting only of 0s and 1s.
// A blank space is a segment of consecutive elements consisting of only 0s.
// Your task is to find the length of the longest blank space.
import java.util.Scanner;
public class cf37{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int maxLength = 0;
            int currentLength = 0;
            for (int j = 0; j < n; j++) {
                int num = scanner.nextInt();
                if (num == 0) {
                    currentLength++;
                } else {
                    maxLength = Math.max(maxLength, currentLength);
                    currentLength = 0;
                }
            }
            maxLength = Math.max(maxLength, currentLength);  // Final check
            System.out.println(maxLength);
        }
    }}
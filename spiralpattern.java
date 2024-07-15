import java.io.*;
import java.util.*;
import java.lang.Math;

public class spiralpattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println();

        int size = 2 * n - 1; 

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                System.out.print(Math.max(Math.abs(i - n), Math.abs(j - n)) + 1 + " ");
            }
            
            System.out.println();
        }
    }
}

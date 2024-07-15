import java.io.*;
import java.util.*;

public class xpattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = "12345"; 
        int len = str.length(); 
        
        for (int i = 0; i < len; i++) { 
            int j = len - 1 - i; 
            for (int k = 0; k < len; k++) { 
                if (k == i || k == j) 
                    System.out.print(str.charAt(k)); 
                else
                    System.out.print(" "); 
            } 
            System.out.println(); 
        } 
    }
}

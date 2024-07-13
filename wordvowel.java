import java.io.*;
import java.util.*;
public class wordvowel {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char c[]=str.toCharArray();
        int vowel=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u')
            vowel++;

        }
        System.out.print(vowel);
    }
}

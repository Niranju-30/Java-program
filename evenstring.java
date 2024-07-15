import java.io.*;
import java.util.*;
public class evenstring {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        for(String word:s)
        {
        System.out.println(word  +"-"+  word.length());
        
       
        if(word.length() % 2 == 0)
        {
            System.out.println("Even number words:" +word);
        }
        }
    }
        
       
    }
    


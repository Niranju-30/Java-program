import java.io.*;
import java.util.*;
public class asci { 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            int value=c;  
            if(value%2==0)
            {

                System.out.print(c);
            }
        }
    }
    
}

import java.io.*;
import java.util.*;
public class factors
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println(i);
            }
        }
       
    }
} 
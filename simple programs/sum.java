import java.io.*;
import java.util.*;
public class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int temp=0;
           int rem=0;
        for(int i=0;i<num;i++)
        {
           
           rem=num%10;
           temp=temp+rem;
           num=num/10;
        }
        System.out.println("sum of digits:" + temp);
    }
}
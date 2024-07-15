import java.io.*;
import java.util.*;
public class binary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rem=0;
        double temp=0;
        int count=0;
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        while(num>=1)
        {
          rem=num%10;
           double product=rem * Math.pow(2,count);
          temp=temp+product;
          num=num/10;
          count++;  
        }
        int result=(int) temp;
        System.out.println("binary to decimal: " + result);
    }
}
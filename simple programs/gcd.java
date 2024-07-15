import java.io.*;
import java.util.*;
public class gcd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1=sc.nextInt();
        System.out.print("Enter the number2: ");
        int num2=sc.nextInt();
        int r=0;
        int a=num1>num2 ? num1:num2;
        int b=num1<num2 ? num1:num2;
        while(a%b!=0)
        {
            r=a%b;
            a=b;
            b=r;
        }
        System.out.println(r);
    }
}

import java.io.*;
import java.util.*;
public class magic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1=sc.nextInt();
System.out.print("Enter the number2: ");
        int num2=sc.nextInt();

        int a=num1>num2 ? num1:num2;
        int b=num1<num2 ? num1:num2;

        System.out.print(a);
        System.out.print(b);
    }
}
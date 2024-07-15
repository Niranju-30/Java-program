import java.io.*;
import java.util.*;
public class lcm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int num1=sc.nextInt();
        System.out.print("Enter the number2: ");
        int num2=sc.nextInt();
        int r=0,max;
        int a=num1>num2 ? num1:num2;
        int b=num1<num2 ? num1:num2;
        max=a;
        do{
            if(max%a==0 && max%b==0)
            {
                System.out.println(max);
                break;
            }
            else{
                max++;
            }

           
        }
         while(true);
    }
}
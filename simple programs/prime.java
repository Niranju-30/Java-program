import java.io.*;
import java.util.*;
public class prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        boolean check=false;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                System.out.println(i); 
                check=true;
                break;
            
            }
        }
        if(check==true)
        {
            System.out.print("Number is Not a prime");
        }
        else{
            System.out.print("Number is a prime");
        }
    }
}
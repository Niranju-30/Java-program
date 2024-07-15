import java.io.*;
import java.util.*;
public class perfect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int temp=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                temp=temp+i;
            }
        }
        if(num==temp)
        {
            System.out.print("Number is perfect");
        }
        else{
            System.out.print("Number is not perfect");
        }
    }
}
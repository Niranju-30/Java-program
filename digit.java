import java.io.*;
import java.util.*;
public class digit 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rem=0;
        int sum=0;
        int check=0;
        while(num!=0)
        {
            rem=num%10;
            sum=rem;
            if(sum>check)
            {
                check=sum;
            }
            num=num/10;
        }
        System.out.print("Greatest number:" +check);
    }
    
}

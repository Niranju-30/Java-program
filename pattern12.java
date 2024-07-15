import java.io.*;
import java.util.*;
public class pattern12 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=1;
        int temp=0;
        for(int i=1;i<=num;i++)
        {
             temp=sum+i-1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(temp+ " ");
                temp--;
                sum++;
            }
            System.out.println();
        }
    }
    
}

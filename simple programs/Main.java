import java.io.*;
import java.util.*;
class main
{
    public static void main(String args[])
    {
        int sum1=0;
        int first=0;
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int [][] arr=new int[n][n];
       for(int i=0;i<n;i++)
       {
        for(int j=1;j<n;j++)
        {
            arr[i][j]=s.nextInt();
        }
       }
       for(int i=0;i<n;i++)
       {
        first=arr[i][i];
       }
       sum1=sum1+first;
       first=0;

    }
}
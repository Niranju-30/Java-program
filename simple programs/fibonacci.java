import java.io.*;
public class fibonacci
{
    public static void main(String args[])
    {
        int first=0;
        int second=1;
        int temp=0;
        for(int i=1;i<=6;i++)
        {
            
            temp=first+second;
            System.out.print(first +" ");
            first=second;
            second=temp;
           
        }
        
    }
}
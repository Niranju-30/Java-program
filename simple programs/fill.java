import java.io.*;
import java.util.*;
public class fill
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.fill(arr,4);
        System.out.print(Arrays.toString(arr));
    }
}
import java.io.*;
import java.util.*;
public class contains
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1="hello world";
        String str=sc.nextLine();
        if(str.contains(str1))
        {
            System.out.print("Yes");
        }
        else
        System.out.print("No");
    }
}
import java.io.*;
import java.util.*;
public class triangle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b >c && b+c >a && c+a >b)
        {
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }

    }
    
}

import java.io.*;
import java.util.*;
public class patternchar {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1="@?>";
        for(int i=0;i<3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                System.out.print(s1.charAt(i));
            }
            System.out.println();
        } 
    }  
}

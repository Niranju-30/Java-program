import java.io.*;
import java.util.*;
public class grade
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Mark: ");
        int mark=sc.nextInt();
        if(mark>100 || mark<0)
        {
            System.out.print("you should not use +ve or -ve");
        }
        else
        {
            if(mark>90 & mark<=100)
            {
                System.out.print("Your Grade is: A");
            }
            else if(mark>80 & mark<=90)
            {
                System.out.print("Your Grade is: B");
            }
            else if(mark>70 & mark<=80)
            {
                System.out.print("Your Grade is: C");
            }
            else if(mark>60 & mark<=70)
            {
                System.out.print("Your Grade is: D");
            }
             else if(mark>50 & mark<=60)
            {
                System.out.print("Your Grade is: E");
            }
             else if(mark<=50 & mark>=0)
            {
                System.out.print("Your Grade is: reappear");
            }
        }
    }
}
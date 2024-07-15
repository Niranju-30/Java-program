import java.io.*;
import java.util.*;
public class leapyear
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year=sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.print("Year is leap year");
                }
                else{
                    System.out.print("year is not a leap year");
                }
            }
            else{
                System.out.print("Year is leap year");
            }
        }
        else{
            System.out.print("Year is not a leap year");
        }
        
    }
}
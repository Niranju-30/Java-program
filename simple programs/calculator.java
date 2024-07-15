import java.io.*;
import java.util.*;
public class calculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number1 :");
        int num1=sc.nextInt();
        System.out.print("Enter the number2 :");
        int num2=sc.nextInt();
        System.out.print("Enter the operator :");
        char x=sc.next().charAt(0);

        switch(x)
        {
        case '+':
            {
            System.out.print(num1+num2);
            break;
            }
            case '-':
            {
            System.out.print(num1-num2);
            break;
            }
            case '*':
            {
            System.out.print(num1*num2);
            break;
            }
            case '/':
            {
            System.out.print(num1/num2);
            break;
            }
        }

    }
}
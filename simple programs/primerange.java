import java.io.*;
import java.util.*;
public class primerange
{
    public static void main(String args[])
    {
        for(int i=50; i<=100; i++)
        {
            boolean check=false;
            for(int j=2; j<i/2; j++)
            {
              if(i%j==0)
              {
                check=true;
                break;
              }
              
              }
              if(check==false){
                System.out.println(i);
              }
            }

        }
    }
    
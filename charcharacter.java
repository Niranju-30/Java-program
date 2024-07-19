import java.io.*;
import java.util.*;
public class charcharacter {
        public static void main(String[] args) {
            // Using char
            char letter = 'A';
            System.out.println("char: " + letter);
    
            // Using Character
            Character letterObj = 'A';
            System.out.println("Character: " + letterObj);
            
            // Using Character methods
            System.out.println("Is digit: " + Character.isDigit(letterObj));
            System.out.println("Uppercase: " + Character.toUpperCase(letterObj));
        }
    }
    


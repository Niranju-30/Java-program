import java.io.*;
import java.util.*;
public class firstletter {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence";
        String[] words = sentence.split(" ");

        for (String word : words) {
            if (word.length() > 0) { 
                System.out.print(word.charAt(0) + " ");
            }
        }
    }
}


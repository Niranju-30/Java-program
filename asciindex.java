import java.util.Scanner;

public class asciindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] c = str.toCharArray();
        
        for (int i = 0; i < str.length(); i++) {
            int j;
            for ( j = 0; j < i; j++) {

                if (c[i] == c[j]) {
                    break;
                }
            }
            if (j == i) {
                System.out.println(c[i] + " - " + i);
            }
        }
    }
}

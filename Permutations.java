public class Permutations {

    public static void main(String[] args) {
        String str = "ABC";
        permute(str.toCharArray(), 0, str.length() - 1);
    }

    public static void permute(char[] chars, int l, int r) {
        if (l == r) {
            System.out.println(new String(chars));
        } else {
            for (int i = l; i <= r; i++) {
                char[] newChars = chars.clone();
                newChars[l] = chars[i];
                newChars[i] = chars[l];
                
                // Recurse with the new permutation
                permute(newChars, l + 1, r);
            }
        }
    }
}

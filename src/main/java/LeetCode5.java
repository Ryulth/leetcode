import java.util.LinkedList;
import java.util.List;

public class LeetCode5 {
    public static void main(String[] strings) {
//        System.out.println(longestPalindrome("babad"));

        System.out.println(longestPalindrome("abacab"));

    }
    public static String longestPalindrome(String s) {
        if(s.isEmpty()) {
            return "";
        }
        char[] chars = s.toCharArray();
        boolean[][] cache = new boolean[chars.length][chars.length];
        int maxI = 0;
        int maxJ = 0;
        for (int i = chars.length -1 ; i >= 0; i--) {
            for (int j = i; j< chars.length;j++) {
                if (j-i < 3) {
                    cache[i][j] = chars[i] == chars[j];
                } else {
                    cache[i][j] = (chars[i] == chars[j]) && cache[i+1][j-1];
                }
                if(cache[i][j] && (j-i)+1 > maxJ - maxI) {
                    maxI = i;
                    maxJ = j;
                }

            }
        }
        return s.substring(maxI, maxJ+1);
    }

}

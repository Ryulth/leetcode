public class JavaUtils {
    public static int parseString(String num) {
        int sum = 0;
        for (char c: num.toCharArray()){
            sum = sum * 10 + (c - '0');
        }
        return sum;
    }
}

import java.util.Calendar;

public class LeetCode8 {
    public static void main(String[] strings) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("  -42"));

        System.out.println(myAtoi("asd  -42"));
        System.out.println(myAtoi("-42  asda" ));
        System.out.println(myAtoi("-2147483648"));
    }

    private static int myAtoi(String s){
        long result = 0, sign = 1;
        s = s.trim();
        int index = -1;
        for (char c : s.toCharArray()) {
            index ++;
            if (index == 0 && '-' == c) {
                sign = -1;
                continue;
            }
            if (index == 0 && '+' == c) {
                continue;
            }
            if (Character.isDigit(c)) {
                result = result*10 + Character.getNumericValue(c);
                if (sign*result > Integer.MAX_VALUE || sign*result < Integer.MIN_VALUE) {
                    result = sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    break;
                }
                continue;
            }
            break;
        }
        return (int) (sign * result);
    }
}

import java.util.Stack;

public class LeetCode227 {
    public static void main(String[] strings) {
        System.out.println(calculate("3-9"));
    }

    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        char[] chars = s.toCharArray();

        int num = 0;
        char operation = '+';
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (Character.isDigit(ch)) {
                while (i < chars.length && Character.isDigit(chars[i])) {
                    num = num * 10 + Character.getNumericValue(chars[i]);
                    i++;
                }
                i--;
            }
            if ((!Character.isDigit(ch) && !Character.isWhitespace(ch)) || i == chars.length -1) {
                int prev;
                switch (operation) {
                    case '+' :
                        stack.push(num);
                        break;
                    case '-' :
                        stack.push(-num);
                        break;
                    case '*' :
                        prev = stack.pop();
                        stack.push(prev * num);
                        break;
                    case '/' :
                        prev = stack.pop();
                        stack.push(prev/num);
                }
                operation = ch;
                num = 0;
            }
        }


        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}

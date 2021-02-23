import java.util.Stack;

public class LeetCode224 {
    public static void main(String[] strings) {
        System.out.println(calculate("1-(5)"));

    }

    public static int calculate(String s) {
        Stack<Object> stack = new Stack<>();
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
            if ((!Character.isDigit(ch) && !Character.isWhitespace(ch)) || i == chars.length - 1) {
                System.out.println(i + " " + ch +" " + operation + " " + num);
                switch (operation) {
                    case '+':
                        stack.push(num);
                        operation = ch;
                        break;
                    case '-':
                        stack.push(-num);
                        operation = ch;
                        break;
                    case '(':
                        stack.push('(');
                        stack.push(num);
                        break;
                    case ')':
                        int temp = 0;
                        System.out.println(stack);
                        while (stack.peek() instanceof Integer) {
                            temp += (int) stack.pop();
                        }
                        System.out.println(stack);
                        stack.pop();
                        stack.push(temp);
                        System.out.println(stack);
                        break;
                }
                if (i == chars.length-1 && ch == ')') {
                    int temp = 0;
                    System.out.println(stack);
                    while (stack.peek() instanceof Integer) {
                        temp += (int) stack.pop();
                    }
                    stack.pop();
                    stack.push(temp);
                }
                num = 0;
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += (int) stack.pop();
        }
        return sum;
    }
}

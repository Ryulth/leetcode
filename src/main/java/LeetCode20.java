import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LeetCode20 {

    private static Map<Character, Character> validationMap = new HashMap<Character, Character>() {
        {
            put(')','(');
            put(']','[');
            put('}','{');
        }
    };
    public static void main(String[] strings) {
        System.out.println(isValid("[]]"));
    }
    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (validationMap.containsKey(c)) {
                if (stack.isEmpty() || validationMap.get(c) != stack.pop()) {
                    return false;
                }
            } else if (validationMap.containsValue(c)){
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}

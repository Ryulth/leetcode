import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
        String[] reg = {"ace", "ace1", "ace3", "ace2"};
        System.out.println(solution(reg, "ace"));
    }

    static String solution(String[] registered_list, String new_id) {
        int index = 0;
        for (; index<new_id.length(); index++) {
            if (! Character.isLowerCase(new_id.charAt(index))) {
                break;
            }
        }
        String s = new_id.substring(0 , index);
        String n = new_id.substring(index);
        Set<String> registered_set = new HashSet<String>(Arrays.asList(registered_list));

        int count = (n.equals("")) ? 0 : Integer.parseInt(n);

        while (true) {
            String numString = (count == 0) ? "" : String.valueOf(count);
            if(registered_set.contains(s + numString)){
                count++;
            } else {
                return s+numString;
            }
        }
    }


    static boolean validationCheck(String newId) {
        if (newId.length() < 3 || newId.length() > 12) {
            return false;
        }
        int pos = 0;
        int sMax = Math.min(newId.length(), 6);
        for (; pos < sMax; pos++) {
            if (! Character.isLowerCase(newId.charAt(pos))) {
                if(pos < 3) {
                    return false;
                } else {
                    break;
                }
            }
        }
        if (pos < newId.length()) {
            if (newId.charAt(pos) == '0') {
                return false;
            }
        }
        for(; pos<newId.length() ; pos ++) {
            if (!Character.isDigit(newId.charAt(pos))) {
                return false;
            }
        }

        return true;
    }
}

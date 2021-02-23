import java.util.*;

public class LeetCode49 {
    public static void main(String[] strings) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();

        for (String str : strs) {
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String key = String.valueOf(temp);
            group.putIfAbsent(key, new ArrayList<>());
            group.get(key).add(str);
        }

        return new ArrayList<>(group.values());
    }
}

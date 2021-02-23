import java.util.Arrays;

public class LeetCode334 {
    public static void main(String[] strings) {
        int[] nums = {5, 1, 5, 5, 2, 5, 4};
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums) {
        if (nums.length == 0) {
            return false;
        }

        int[] cache = new int[nums.length];
        Arrays.fill(cache, 1);

        for (int i =0; i < nums.length ; i ++) {
            for (int j = 0; j < i ; j ++) {
                if (nums[j] < nums[i]) {
                    cache[i] = Math.max(cache[j]+1, cache[i]);
                    if (cache[i] == 3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

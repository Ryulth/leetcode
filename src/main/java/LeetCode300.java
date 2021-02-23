import java.util.Arrays;
import java.util.Collections;

public class LeetCode300 {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }

    public static int lengthOfLIS(int[] nums) {
        int[] counts = new int[nums.length];
        Arrays.fill(counts, 1);
        for (int i = 0 ; i < nums.length; i ++) {
            for (int j = 0 ; j <i ; j++) {
                if (nums[j] < nums[i]) {
                   counts[i] = Math.max(counts[i], counts[j] + 1);
                }
            }
        }

        return Arrays.stream(counts).max().getAsInt();
    }
}

import java.util.Arrays;

public class LeetCode75 {
    public static void main(String[] strings) {
        int[] a = {1, 0, 1, 1, 2};
        sortColors(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sortColors(int[] nums) {
        // red 0 white 1 blue 2
        int red = 0, white = 0, blue = 0;
        for (int num : nums) {
            switch (num) {
                case 0:
                    red++;
                    break;
                case 1:
                    white++;
                    break;
                default:
                    blue++;
                    break;
            }
        }
        for (int i = 0; i < red; i++) {
            nums[i] = 0;
        }
        for (int i = red; i < red + white; i++) {
            nums[i] = 1;
        }
        for (int i = red + white; i < red + white + blue; i++) {
            nums[i] = 2;
        }
    }
}

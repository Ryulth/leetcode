public class LeetCode55 {
    public static void main(String[] args) {
        int[] nums = {2,0,0};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {

        if (nums.length == 1) {
            return true;
        }
        if (nums[0] == 0) {
            return false;
        }
        int finishIdx= nums.length-1;
        for (int i = nums.length-1 ; i >= 0; i -- ){
            int num = nums[i];
            if (i + nums[i] >= finishIdx) {
                finishIdx = i;
            }
        }
        return finishIdx == 0;
    }
}

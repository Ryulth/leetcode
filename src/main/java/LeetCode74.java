import java.util.Arrays;

public class LeetCode74 {
    public static void main(String[] strings) {
        int[][] a = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(a, 3));
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
            if (ints[0] <= target && target <= ints[ints.length-1]) {
                for (int num : ints) {
                    if (num == target) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }
}

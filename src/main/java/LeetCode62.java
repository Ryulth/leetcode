import java.util.Arrays;

public class LeetCode62 {
    public static void main(String[] args) {
        int m = 7;
        int n = 3;
        System.out.println(uniquePaths(m, n));
    }

    public static int uniquePaths(int m, int n) {
        int[][] maps = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    maps[i][j] = 1;
                } else {
                    maps[i][j] = maps[i - 1][j] + maps[i][j - 1];
                }
            }
        }
        return maps[m-1][n-1];
    }

}

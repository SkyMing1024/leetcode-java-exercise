package indi.sky.leetcode;

/**
 * 63. 不同路径 II
 */
public class Question63 {
    /**
     * 核心思想同[62. 不同路径] dp[i][j] = dp[i-1][j]+dp[i][j-1]
     * 不同点：
     * 当nums[i][j]==1时，表示障碍，此路径不同，此时将dp[i][j]置0，对后续计算没有影响
     * 需要注意的地方：
     * 依然是边界的处理，边界上nums[i][0]==1或nums[0][j]==1时，
     * 不能仅仅将dp[i][0]或dp[0][j]置0，要将整个一列的值都置0
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        boolean flag = false;
        for (int i = 0; i < m; i++) {
            if (!flag && obstacleGrid[i][0] == 1){
                flag = true;
            }
            dp[i][0] = flag ? 0 : 1;
        }
        flag = false;
        for (int j = 0; j < n; j++) {
            if (!flag && obstacleGrid[0][j] == 1){
                flag = true;
            }
            dp[0][j] = flag ? 0 : 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                }else {
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}

package indi.sky.leetcode;

/**
 * 62. 不同路径
 * 和[70.爬楼梯]很像，思路和代码都类似
 * 用递归耗时长，可以用动态规划改善
 */
public class Question62 {
    /**
     *  递归法：
     *  f(m,n) = f(m-1,n) + f(m,n-1)
     *  可以解决问题，但是时间复杂度太太太高
     */
    public int uniquePaths1(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        return uniquePaths1(m - 1, n) + uniquePaths1(m, n - 1);
    }

    /**
     * 动态规划：
     * 核心思想： dp[i][j] = dp[i-1][j]+dp[i][j-1];
     * 与递归法的区别：构造一个二维数组存储每个状态的结果，而不是像递归那样一层层递归下去。
     * 易错点：边界点需要单独处理，边界上值全部为1
     */
    public int uniquePaths2(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    public int uniquePaths3(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0){
                    dp[i][j] = 1;
                }else {
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}


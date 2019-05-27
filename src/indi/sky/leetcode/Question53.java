package indi.sky.leetcode;

/**
 * 53. 最大子序和
 */
public class Question53 {
    /**
     * 1.暴力循环
     * 2.分治算法
     * 3.动态规划*
     * dp[i] = max(dp[i-1]+sums[i],sums[i])
     */
    public int maxSubArray31(int[] nums) {
        if(nums.length == 0)return 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i< nums.length;i++){
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
        }
        int res = dp[0];
        for(int i = 0; i< dp.length;i++){
            res = Math.max(dp[i],res);
        }
        return res;
    }

    /**
     * 动态规划简化版
     */
    public int maxSubArray32(int[] nums) {
        if (nums.length == 0) return 0;
        int res = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = Math.max(sum+nums[i],nums[i]);
            res = Math.max(res,sum);
        }
        return res;
    }
}

package indi.sky.leetcode;

/**
 * 70. 爬楼梯
 */
public class Question70 {
    /**
     * 递归解法::
     * f(n) = f(n-1) + f(n-2)
     * f(1) = 1
     * f(2) + 2
     * 缺点: 时间复杂度极大, 甚至无法通过leetcode提交
     */
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }else{
            return climbStairs(n-1)+climbStairs(n-2);
        }
    }

    /**
     * 动态规划
     * 参考官方解法
     * 时间复杂度：O(n)，单循环到 n 。
     * 空间复杂度：O(n)，dp 数组用了 n 的空间。
     */
    public int climbStairsByDp(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    public static void main(String[] args){
        Question70 q = new Question70();
        //获取开始时间
        long startTime=System.currentTimeMillis();
        int res = q.climbStairsByDp(50);
        //获取结束时间
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
        System.out.println("结果:"+res);
    }
}

package indi.sky.leetcode;

/**
 * 121. 买卖股票的最佳时机
 */
public class Question121 {
    /**
     * 暴力法
     * 循环求解所有可能值
     * 时间复杂度: O(n^2)
     * 空间复杂度: O(1)
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int temp = prices[j]-prices[i];
                profit =  Math.max(profit,temp);
            }
        }
        return profit;
    }

    public static void main(String[] args){
        Question121 q = new Question121();
        int res  = q.maxProfit(new int[]{7,1,5,3,6,4});
    }
}

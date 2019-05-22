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

    /**
     *  波峰波谷法
     *  找到最低点,判断是否有更大的maxProfit
     *  时间复杂度: O(n)
     *  空间复杂度: O(1)
     */
    public int maxProfit2(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }

    public static void main(String[] args){
        Question121 q = new Question121();
        int res  = q.maxProfit2(new int[]{7,1,5,3,6,4});
    }
}

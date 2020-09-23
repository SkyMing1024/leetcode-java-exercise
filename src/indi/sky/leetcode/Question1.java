package indi.sky.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 */
public class Question1 {
    /**
     * Description :
     * 1.两数之和
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     *你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     *示例:
     *给定 nums = [2, 7, 11, 15], target = 9
     *因为 nums[0] + nums[1] = 2 + 7 = 9
     *所以返回 [0, 1]
     */

    /**
     * 方法一:
     * 暴力循环
     * 时间复杂度 O(n^2), 内外循环导致时间复杂度较大
     * 空间复杂度 O(1)
     */
    public int[] twoSum1(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 方法二:
     * 构建哈希表存值, 以空间换时间
     * 时间复杂度降低至 O(n)
     * 空间复杂度 O(n)
     */
    public int[] towSum2(int[] sums, int target){
        Map<Integer,Object> map = new HashMap<Integer,Object>();
        for (int i = 0; i < sums.length; i++) {
            if(map.containsValue(target - sums[i])){
                return new int[]{i,i};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public void solution(){
        System.out.println("solution");
    }

    public static void main(String[] args){
        Question1 quertion = new Question1();
        quertion.solution();
    }
}

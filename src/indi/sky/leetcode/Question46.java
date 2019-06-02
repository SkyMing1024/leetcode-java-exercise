package indi.sky.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 46. 全排列
 * nums = {1,2,3}
 */
public class Question46 {
    public List<List<Integer>> permute1(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        return list;
    }
    /**
     * 参考解法
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new LinkedList();
        // 入参数组转成list
        ArrayList<Integer> nums_lst = new ArrayList<Integer>();
        for (int num : nums){
            nums_lst.add(num);
        }
        int n = nums.length;
        backtrack(n, nums_lst, output, 0);
        return output;
    }
    public void backtrack(int n,ArrayList<Integer> nums,List<List<Integer>> output,int first) {
        if (first == n)
            output.add(new ArrayList<Integer>(nums));
        for (int i = first; i < n; i++) {
            // 交换
            Collections.swap(nums, first, i);
            // 回溯
            backtrack(n, nums, output, first + 1);
            Collections.swap(nums, first, i);
        }
    }
}

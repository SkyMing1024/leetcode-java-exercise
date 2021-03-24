package indi.sky.leetcode;

import java.util.*;

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

        List<int[]> list = Arrays.asList(nums);

        int n = nums.length;
        backtrack(n, nums_lst, output, 0);
        return output;
    }

    /**
     *
     * @param n 数组长度
     * @param nums 数组
     * @param output 结果（全排列组成的数组）
     * @param first
     */
    public void backtrack(int n,ArrayList<Integer> nums,List<List<Integer>> output,int first) {
        if (first == n){
            output.add(new ArrayList<Integer>(nums));
        }
        for (int i = first; i < n; i++) {
            // 交换
            Collections.swap(nums, first, i);
            // 回溯
            backtrack(n, nums, output, first + 1);
            Collections.swap(nums, first, i);
        }
    }


    List<List<Integer>> res = new LinkedList<>();

    /**
     * 回溯法
     * @param args
     */
    public List<List<Integer>> permute2(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        backtrack2(nums,track);
        return res;
    }

    public void backtrack2(int[] nums,LinkedList<Integer> track){
        // 确定退出条件
        if (nums.length == track.size()){
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            // 排除不符合条件的
            if (track.contains(nums[i])){
                continue;
            }
            // 做出选择
            track.add(nums[i]);
            // 回溯
            backtrack2(nums,track);
            // 撤销选择
            track.removeLast();
        }
    }


    /**
     * 此方法与2相同，只是将结果变量写到方法里
     * @param nums
     * @return
     */
    public List<List<Integer>> permute3(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> track = new LinkedList<>();
        return backtrack3(res,nums,track);
    }
    public List<List<Integer>> backtrack3(List<List<Integer>> res,int[] nums,LinkedList<Integer> track){
        if (nums.length == track.size()){
            res.add(new LinkedList<>(track));
            return res;
        }
        for (int i = 0; i < nums.length; i++) {
            if (track.contains(nums[i])){
                continue;
            }
            track.add(nums[i]);
            backtrack3(res,nums,track);
            track.removeLast();
        }
        return res;
    }




    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        List<List<Integer>> lists = new Question46().permute2(nums);

        System.out.println(lists);



    }
}

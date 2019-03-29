package indi.sky.leetcode;

import indi.sky.algorithm.search.BinarySearch;

/**
 * 33. 搜索旋转排序数组
 * Date : 22:21 2019/3/27
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 你可以假设数组中不存在重复的元素。
 你的算法时间复杂度必须是 O(log n) 级别.
 示例 1:
 输入: nums = [4,5,6,7,0,1,2], target = 0
 输出: 4
 示例 2:
 输入: nums = [4,5,6,7,0,1,2], target = 3
 输出: -1
 相关问题Q81: 搜索旋转排序数组II
 */
public class Question33 extends BinarySearch{
    /**
     * Description : 暴力法
     */
    public int search1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public int search2(int[] nums, int target) {
        int n = nums.length;
        // 查找分界
        int bound = findBounder(nums);
        int res1 = recursionSearch(nums,0,bound,target);
        int res2 = recursionSearch(nums,bound+1,nums.length-1,target);
        return Math.max(res1,res2);
    }

    public int findBounder(int[] nums){
        int n = nums.length;
        // 查找分界
        for (int i = 0; i < n; i++) {
            if (nums[i]>nums[i+1]){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        Question33 quertion = new Question33();
        int[] nums1 = {4,5,6,7,0,1,2};
        int res = quertion.search2(nums1,6);
        System.out.println("结果:"+res);
    }
}

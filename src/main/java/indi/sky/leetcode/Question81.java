package indi.sky.leetcode;

/**
 * 81. 搜索旋转排序数组 II
 * Date : 22:01 2019/3/28
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 ( 例如，数组 [0,0,1,2,2,5,6] 可能变为 [2,5,6,0,0,1,2] )。
 编写一个函数来判断给定的目标值是否存在于数组中。若存在返回 true，否则返回 false。
 注意:数据可能重复
 示例 1:
 输入: nums = [2,5,6,0,0,1,2], target = 0
 输出: true
 示例 2:
 输入: nums = [2,5,6,0,0,1,2], target = 3
 输出: false
 */
public class Question81 extends Question33{
    public boolean search(int[] nums, int target) {
        int bound = findBounder(nums);
        return false;
    }
}

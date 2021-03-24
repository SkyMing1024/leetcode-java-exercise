package indi.sky.leetcode;

/**
 * 26. 删除排序数组中的重复项
 * 双指针法
 */
public class Question26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return (i+1);
    }
    public static void main(String[] args){
        Question26 q = new Question26();
        int[] arr = {1,2,2,2,4,5,5,6};
        int res = q.removeDuplicates(arr);
        System.out.println("结果："+res);

    }
}

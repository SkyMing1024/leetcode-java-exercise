package indi.sky.leetcode;

/**
 * 136. 只出现一次的数字
 */
public class Question136 {
    public int singleNumber(int[] nums) {
        if (nums.length == 0 ){
            return 0;
        }
        if (nums.length == 1 ){
            return nums[0];
        }
        int res = 0;
        for (int i = 0; i <nums.length ; i++) {
            res = res ^ nums[i];
        }
        return res;
    }

    public static void main(String[] args){
        Question136 q = new Question136();
        int res = q.singleNumber(new int[]{1,1,2,3,3,2});
        System.out.println(res);
    }
}

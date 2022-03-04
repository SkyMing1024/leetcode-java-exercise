package indi.sky.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 16. 最接近的三数之和
 */
public class Question16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r){
                int threeSum = nums[l] + nums[r] + nums[i];
                if (Math.abs(threeSum - target) < Math.abs(res - target)) {
                    res = threeSum;
                }
                if (threeSum > target) {
                    r--;
                } else if (threeSum < target) {
                    l++;
                } else {
                    return target;
                }

            }
        }
        return res;
    }

    public static void main(String[] args){
        Question16 quertion = new Question16();
        int[] num = {-1, 2, 1, -4};
         int res = quertion.threeSumClosest(num,1);
        System.out.println("结果:"+res);
    }
}

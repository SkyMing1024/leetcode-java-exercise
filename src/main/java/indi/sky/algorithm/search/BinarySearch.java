package indi.sky.algorithm.search;

import indi.sky.algorithm.sort.BubbleSort;
import indi.sky.leetcode.Question5;

/**
 * 时间复杂度O(logn) 非常优秀的时间复杂度
 */
public class BinarySearch {
    public int binarySearch(int[] nums, int target){
        int index = -1;
        int n = nums.length;
        index = recursionSearch(nums,0,n,target);
        return index;
    }

    /**
     * Description : 递归实现二分查找
     */
    public static int recursionSearch(int[] nums,int start, int end, int target){
        int half = (start+end)/2;
        if (nums[half] > target){
            return recursionSearch(nums,start,half,target);
        }else if (nums[half] < target){
            return recursionSearch(nums,half,end,target);
        }else if (nums[half] == target){
            return half;
        }
        return -1;
    }
    /**
     * Description : 非递归
     * 三点注意:
     */
    public static int normalBinarysearch(int[] nums,int target){
        int index = -1;
        int n = nums.length;
        int left = 0, right = n-1;
        int half = 0;
        // 1.循环退出条件是left<=right,而非left<right
        while (left<=right){
            // 2.half的取值有问题, 如果left和right较大,二者之和可能会溢出.
            //   改进为left+(right-left)/2,
            //   更进一步,可将除以2的操作转化为位运算 left+((right-left)>>1)
            half = (left+right)/2;
            if (nums[half] > target){
                // 3. 注意区间取值 +1 -1
                right = half-1;
            }else if(nums[half] < target){
                left = half+1;
            }else if (nums[half] == target){
                return half;
            }
        }
        return index;
    }

    public static void main(String[] args){
        BinarySearch b = new BinarySearch();
        int[] arr = {2,4,5,6,8,13,67,76,76,88,98};
        int target = 13;
        int res1 = b.binarySearch(arr,target);
        int res2 = b.normalBinarysearch(arr,target);
        System.out.println(" 递归:"+target+"的下标是:"+res1);
        System.out.println("非递归:"+target+"的下标是:"+res2);
    }
}

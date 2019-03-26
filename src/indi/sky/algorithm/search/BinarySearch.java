package indi.sky.algorithm.search;

import indi.sky.algorithm.sort.BubbleSort;
import indi.sky.leetcode.Question5;

/**
 * Author : ming.tian
 * Date : 14:20 2019/3/26
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
    public int recursionSearch(int[] nums,int start, int end, int target){
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
     */
    public int search(int[] nums,int target){
        int index = -1;
        int n = nums.length;
        int left = 0, right = n-1;
        int half = 0;
        while (left<=right){
            half = (left+right)/2;
            if (nums[half] > target){
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
        int res2 = b.search(arr,target);
        System.out.println(" 递归:"+target+"的下标是:"+res1);
        System.out.println("非递归:"+target+"的下标是:"+res2);
    }
}

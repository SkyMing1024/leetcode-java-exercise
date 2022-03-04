package indi.sky.leetcode;

import com.sun.deploy.util.ArrayUtil;
import indi.sky.algorithm.sort.Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。

 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。

 你可以假设 nums1 和 nums2 不会同时为空。

 示例 1:

 nums1 = [1, 3]
 nums2 = [2]

 则中位数是 2.0
 示例 2:

 nums1 = [1, 2]
 nums2 = [3, 4]

 则中位数是 (2 + 3)/2 = 2.5
 */
public class Question4 {

    /**
     * 暴力破解:
     * 两个数组存新数组, 再排序, 再取中位数
     * 缺点明显:
     * 时间空间复杂度太大
     * 时间复杂度：O((m+n)^2)
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m+n];
        for (int i = 0; i < m+n ; i++) {
            if (i<m){
                arr[i] = nums1[i];
            }else {
                arr[i] = nums2[i-m];
            }
        }
        Sort.bubbleSort(arr,arr.length);
        if (arr.length%2 == 0){
            median = (arr[arr.length/2] + arr[arr.length/2-1])/2.0;
        }else {
            median = arr[(arr.length-1)/2];
        }
        return median;
    }

    public static void main(String[] args){
        Question4 quertion = new Question4();
        int[] nums1 = {1,3,4};
        int[] nums2 = {2,5,9};
        double res = quertion.findMedianSortedArrays(nums1,nums2);
        System.out.println("中位数:"+res);
    }
}

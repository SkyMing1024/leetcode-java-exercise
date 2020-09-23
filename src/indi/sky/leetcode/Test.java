package indi.sky.leetcode;

import indi.sky.util.CommonUtil;

import java.util.List;

/**
 */
public class Test {
    public static void main(String[] args){
        Question39 q = new Question39();
        int[] nums = {2,3,6,7};
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] nullArr = {};
        int num = 8;
        //获取开始时间
        long startTime=System.currentTimeMillis();
        List<List<Integer>> res = q.combinationSum(nums,8);
        //获取结束时间
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
        System.out.println("结果:"+res);
    }
}

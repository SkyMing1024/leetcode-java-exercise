package indi.sky.leetcode;

/**
 */
public class Test {
    public static void main(String[] args){
        Question53 q = new Question53();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        //获取开始时间
        long startTime=System.currentTimeMillis();
        int res = q.maxSubArray32(nums);
        //获取结束时间
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
        System.out.println("结果:"+res);
    }
}

package indi.sky.leetcode;

/**
 * 11. 盛水最多的容器
 */
public class Question11 {

    public int maxArea(int[] height) {
        int n = height.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = (j-i) * Math.min(height[i],height[j]);
                res = Math.max(res,temp);
            }
        }
        return res;
    }
    public static void main(String[] args){
        Question11 q = new Question11();
        int res = q.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println("result:"+res);
    }
}

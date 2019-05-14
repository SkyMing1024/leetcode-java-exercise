package indi.sky.leetcode;

import java.util.Arrays;

/**
 * 455. 分发饼干
 * 贪心算法:
 * 每次都尽量用小的饼干来满足胃口小的孩子
 */
public class Question455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int k = 0 ;
        for (int i = 0; i < g.length; i++) {
            for (int j = k; j < s.length; j++) {
                if (g[i] <= s[j]) {
                    k++;
                    break;
                }
            }
        }
        return k;
    }
    
    public static void main(String[] args){
        Question455 q = new Question455();
        int[] child = {1,2,3};
        int[] bis = {1,2,4,3};
        int res = q.findContentChildren(child,bis);
    }
}

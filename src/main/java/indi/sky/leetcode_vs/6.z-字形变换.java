package indi.sky.leetcode_vs;
/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */

// @lc code=start
class Solution6 {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        StringBuilder[] res = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            res[i] = new StringBuilder();
        }
        
        int row = 0;
        int l = s.length();

        boolean flag = false;

        for (int i = 0; i < l; i++) {
            if(!flag){
                char ch = s.charAt(i);
                res[row].append(ch);
                row++;
            }
            if(flag){
                char ch = s.charAt(i);
                res[row].append(ch);
                row--;
            }

            if(row == numRows){
                flag = true;
                row-=2;
            }
            if(row == -1){
                flag = false;
                row+=2;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            ans.append(res[i]);
        }
        return ans.toString();

    }

    public static void main(String[] args) {
        Solution6 s = new Solution6();
        String  res = s.convert("AB", 1);
        System.out.println(res);
    
    
    }
}
// @lc code=end





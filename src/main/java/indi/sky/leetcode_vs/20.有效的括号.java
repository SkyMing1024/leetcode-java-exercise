package indi.sky.leetcode_vs;
/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 *
 * https://leetcode-cn.com/problems/valid-parentheses/description/
 *
 * algorithms
 * Easy (44.54%)
 * Likes:    3048
 * Dislikes: 0
 * Total Accepted:    963.8K
 * Total Submissions: 2.2M
 * Testcase Example:  '"()"'
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 
 * 有效字符串需满足：
 * 
 * 
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：s = "()"
 * 输出：true
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：s = "()[]{}"
 * 输出：true
 * 
 * 
 * 示例 3：
 * 
 * 
 * 输入：s = "(]"
 * 输出：false
 * 
 * 
 * 示例 4：
 * 
 * 
 * 输入：s = "([)]"
 * 输出：false
 * 
 * 
 * 示例 5：
 * 
 * 
 * 输入：s = "{[]}"
 * 输出：true
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 
 * s 仅由括号 '()[]{}' 组成
 * 
 * 
 */

import org.apache.commons.lang3.ArrayUtils;

import java.util.Stack;

// @lc code=start
class Solution20 {
    public boolean isValid(String s) {
        if (s.length()%2!=0){
            return false;
        }
        boolean flag = false;
        Stack<Character> stack = new Stack<>();
        char[] arr1 = new char[]{'（','{','['};
        char[] arr2 = new char[]{'）','}',']'};
        String[] arr3 = new String[]{"()","{}","[]"};

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '(' || a == '{' || a == '['){
                stack.push(a);
            }else {
                if (stack.size()==0){
                    return false;
                }else {
                    if (a==')' && stack.pop()!='(') return false;;
                    if (a==']' && stack.pop()!='[') return false;;
                    if (a=='}' && stack.pop()!='{') return false;;

                }
            }
        }
        flag = stack.size()==0?true:false;
        return flag;
    }

    // public static void main(String[] args) {
    //     Solution20 s = new Solution20();
    //     s.isValid("()");
    // }
}
// @lc code=end


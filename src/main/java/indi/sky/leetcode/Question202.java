package indi.sky.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 202. 快乐数
 * 关键是判断返回false的条件
 * 如果是快乐数的话, 总会得到1,
 *
 */
public class Question202 {
    public boolean isHappy(int n) {
        List<Integer> list = new ArrayList<>();
        while (true){
            int res = sum(n);
            if (res == 1){
                return true;
            }else if (list.contains(res)){
                return false;
            }else {
                list.add(res);
            }
            n = res;
        }
    }

    public int sum (int n){
        String str = String.valueOf(n);
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            int a = Integer.valueOf(str.charAt(i)+"");
            res += a*a;
        }
        return res;
    }

    public static void main(String[] args){
        Question202 q = new Question202();
        char[] a = {1,2,3,4};
        boolean flag = q.isHappy(19);
    }
}

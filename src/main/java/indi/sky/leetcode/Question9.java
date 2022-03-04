package indi.sky.leetcode;

import javafx.beans.binding.When;

/**
 * 9.回文数
 */
public class Question9 {
    public boolean isPalindrome(int x) {
        boolean res = false;
        if (x<0 ||(x%10==0&&x!=0)){
            return false;
        }
        int temp = 0;
        while (x>temp){
            temp = temp*10 +x%10;
            x = x/10;
        }
        return x == temp || x == temp/10;
    }

    public static void main(String[] args){
        Question9 question = new Question9();
        boolean res = question.isPalindrome(10);
        System.out.println("res:"+res);
    }
}

package indi.sky.leetcode;

import indi.sky.dataStructure.ListNode;

import java.util.Stack;

/**
 * 234. 回文链表
 */
public class Question234 {
    /**
     * Description :
     * 栈
     * 1.遍历链表将所有元素入栈
     *   (栈中依次出栈,则与链表中的元素互为倒序)
     * 2.再次遍历链表,并与栈顶元素比较
     * 3.若有不相等的则不是回文
     *  时间复杂度O(n)
     *  空间复杂度O(n)
     *  缺点:
     *  回文只需比较前一半与后一半即可, 此法比较了整个链表
     *  其他解法:
     *  快慢指针
     */
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode dummy = head;
        while (dummy != null){
            stack.push(dummy);
            dummy = dummy.next;
        }
        while (head != null){
            ListNode temp = stack.pop();
            if (head.val != temp.val){
                return false;
            }
            head = head.next;
        }
        return true;
    }
    public static void main(String[] args){
        Question234 q = new Question234();
        ListNode ln1 =  new ListNode(1);
        ln1.next = new ListNode(2);
        ln1.next.next = new ListNode(3);
        boolean res = q.isPalindrome(ln1);
        System.out.println(res);
    }
}

package indi.sky.leetcode;

import indi.sky.dataStructure.ListNode;

/**
 * 19. 删除链表的倒数第N个节点
 */
public class Question19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = head;
        int length = 0;
        while (head.next!=null){
            length++;
            head = head.next;
        }
        int s = length - (n-1);
        return res;
    }


    public static void main (String[] args){
        ListNode ln1 = new ListNode(2);
        ln1.next = new ListNode(3);
        ln1.next.next = new ListNode(6);
        ln1.next.next.next = new ListNode(4);
        Question19 q = new Question19();
        ListNode res = q.removeNthFromEnd(ln1,4);
        System.out.println("结果:"+res);
    }
}

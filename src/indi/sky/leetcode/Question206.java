package indi.sky.leetcode;

import indi.sky.dataStructure.ListNode;

/**
 * 206. 反转链表
 */
public class Question206 {
    /**
     * Description :
     * 迭代解法:
     * 1. 将当前节点node的下一节点指向node的前置节点
     * 2. 将node的前置节点指向node, 将node指向node的下一节点, 即将前置节点和当前节点后移一位
     */
    public ListNode reverseListByIterator(ListNode head) {
        ListNode res = null;
        ListNode node = head;
        ListNode temp = null;
        while (node!=null){
            temp = node.next;
            node.next = res;
            res = node;
            node = temp;
        }
        return res;
    }

    public static void main(String[] args){
        Question206 q = new Question206();
        ListNode ln = new ListNode(1);
        ln.next = new ListNode(2);
        ln.next.next = new ListNode(3);
        ln.next.next.next = new ListNode(4);
        ListNode list = q.reverseListByIterator(ln);
    }
}

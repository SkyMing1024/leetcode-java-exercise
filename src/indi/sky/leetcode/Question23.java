package indi.sky.leetcode;

import indi.sky.dataStructure.ListNode;

/**
 * 23 合并K个排序链表
 */

/**
 * Description :
 * 分治算法 递归求解
 */
public class Question23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0){
            return null;
        }
        if (lists.length == 1){
            return lists[0];
        }
        Question21 util = new Question21();
        ListNode res = util.mergeTwoLists(lists[0],lists[1]);
        for (int i = 2; i < lists.length; i++) {
            res = util.mergeTwoLists(res,lists[i]);
        }
        return res;
    }

    public static void main(String[] args){
        ListNode ln1 = new ListNode(2);
//        ln1.next = new ListNode(3);
//        ln1.next.next = new ListNode(5);
        ListNode ln2 = new ListNode(-1);
//        ln2.next = new ListNode(8);
//        ln2.next.next = new ListNode(7);
        ListNode ln3 = new ListNode(9);
//        ln3.next = new ListNode(6);
//        ln3.next.next = new ListNode(9);
        ln1.print();
        ln2.print();
        ln3.print();
        Question23 q = new Question23();
        ListNode res = q.mergeKLists(new ListNode[]{});
        res.print();
    }
}

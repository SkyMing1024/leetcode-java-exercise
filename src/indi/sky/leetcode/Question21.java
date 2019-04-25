package indi.sky.leetcode;

import indi.sky.dataStructure.ListNode;

/**
 * 21. 合并两个有序链表
 */
public class Question21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){return l2;}
        if (l2 == null){return l1;}
        ListNode res ;
        int val1 = l1.val,val2 = l2.val;
        if (val1 < val2){
            res = l1;
            res.next =  mergeTwoLists(l1.next,l2);
        }else {
            res = l2;
            res.next =  mergeTwoLists(l1,l2.next);
        }
        return res;
    }

    public static void main (String[] args){
        ListNode ln1 = new ListNode(2);
        ln1.next = new ListNode(3);
//        ln1.next.next = new ListNode(5);
        ListNode ln2 = new ListNode(1);
        ln2.next = new ListNode(4);
//        ln2.next.next = new ListNode(6);

        ln1.print();
        ln2.print();
        Question21 q = new Question21();
        ListNode res = q.mergeTwoLists(ln1,ln2);
        res.print();
    }
}

package indi.sky.leetcode;

import indi.sky.dataStructure.ListNode;

/**
 * 19. 删除链表的倒数第N个节点
 * 1.计算倒数第n个 ,即为正数第 k = length-(n-1) 个
 * 2.删除第k个节点
 */
public class Question19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = head;
        ListNode first = head;
        int length = 1;
        while (head.next!=null){
            length++;
            head = head.next;
        }
        int target = length - (n-1);

        return this.remove(res,target);
    }

    public ListNode remove(ListNode l, int index){
        ListNode res = l;
        int count = 0;
        while (l!=null){
            count++;
            if (count == index-1){
                l.next = l.next.next;
                break;
            }else {
                l = l.next;
            }
        }
        return res;
    }


    public static void main (String[] args){
        ListNode ln1 = new ListNode(2);
        ln1.next = new ListNode(3);
        ln1.next.next = new ListNode(6);
        ln1.next.next.next = new ListNode(4);
        Question19 q = new Question19();
        ListNode res = q.removeNthFromEnd(ln1,3);

    }
}

package indi.sky.leetcode;

import indi.sky.dataStructure.ListNode;

import java.util.List;

/*
给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

示例：
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
 */


public class Question2 {

    /**
     * Description :
     * 方法一
     * 1.将链表代表的数用转成int型
     * 2.int型数相加
     * 3.将int结果用链表表示
     *
     * 复杂度：O(m+n)
     *
     * 此方法致命问题：
     * 将链表转化为int整数时，会超出int的表示范围。
     * int占4个字节，表示范围为[-2^32,2^31],链表表示的数字可能会超出此范围，这时，此方法彻底失效。
     */
    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        int a = this.getListNodeValue(l1) + this.getListNodeValue(l2);
        String str = String.valueOf(a);
        ListNode head = new ListNode(getEachBitInt(a,1));
        ListNode curryNode = head;
        for (int i = 2; i < str.length()+1 ; i++) {
            curryNode.next = new ListNode(getEachBitInt(a,i));
            curryNode = curryNode.next;
        }
        return head;
    }

    /**
     * Description :
     * 方法2
     * 循环链表,带进位运算
     * 时间复杂度：O(max(m,n))
     * 空间复杂度：O(mac(m,n))
     */
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2){
        ListNode head = null,tail = null;
        int n1,n2,sum,carry=0;
        while (l1!=null || l2!=null){
            n1 = l1 != null ? l1.val : 0;
            n2 = l2 != null ? l2.val : 0;
            sum = n1 + n2 + carry;
            if (head == null){
                head = tail = new ListNode(sum%10);
            }else {
                tail.next = new ListNode(sum%10);
                tail = tail.next;
            }
            carry = sum >= 10 ? 1 : 0;
            l1 = l1!=null ? l1.next : l1;
            l2 = l2!=null ? l2.next : l2;
        }
        if (carry > 0){
            tail.next = new ListNode(carry);
        }
        return head;
    }


    /**
     * Description : 求链表所代表的值.如: (2 -> 4 -> 3) => 342
     */
    private static int getListNodeValue(ListNode l1){
        int a = l1.val;
        int n = 0;
        ListNode curNode = l1.next;
        while (curNode!=null) {
            n++;
            int b = curNode.val;
            for (int i = 0; i < n; i++) {
                b = b*10;
            }
            a+=b;
            curNode = curNode.next;
        }
        return a;
    }

    /**
     * Description : 获取整数num的第n位上的数
     */
    private int getEachBitInt(int num, int n){
        String str = String.valueOf(num);
        int a = -1;
        int count = 1;
        while (count <= n) {
            a = num % 10;
            num = num / 10;
            count++;
        }
        return a;
    }

    public static void main (String[] args){


        ListNode ln1 = new ListNode(9);
//        ListNode ln2 = new ListNode(9);
//        ListNode ln3 = new ListNode(9);
//        ln1.next=ln2;
//        ln2.next=ln3;

        ListNode ln11 = new ListNode(1);
        ListNode ln22 = new ListNode(9);
        ListNode ln33 = new ListNode(9);
        ListNode ln44 = new ListNode(9);
        ListNode ln55 = new ListNode(9);
        ListNode ln66 = new ListNode(9);
        ListNode ln77 = new ListNode(9);
        ListNode ln88 = new ListNode(9);
        ListNode ln99 = new ListNode(9);
        ListNode ln10 = new ListNode(9);
        ln11.next=ln22;
        ln22.next=ln33;
        ln33.next=ln44;
        ln44.next=ln55;
        ln55.next=ln66;
        ln66.next=ln77;
        ln77.next=ln88;
        ln88.next=ln99;
        ln99.next=ln10;
        Question2 q = new Question2();
        int a = q.getListNodeValue(ln1);
        int b = q.getListNodeValue(ln11);
        System.out.print("链表一：");ln1.print();
        System.out.print("链表二：");ln11.print();
        System.out.println(a + " + " + b + "=");
        System.out.println("方法一结果:" + getListNodeValue(q.addTwoNumbers1(ln1,ln11)));

    }
}

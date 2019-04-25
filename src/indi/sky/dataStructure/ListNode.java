package indi.sky.dataStructure;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public void print(){
        ListNode tmp = this;
        StringBuilder res = new StringBuilder();
        while (tmp!=null){
            res.append(tmp.val);
            res.append("->");
            tmp = tmp.next;
        }
        res.append("null");
        System.out.println(res);
    }
}

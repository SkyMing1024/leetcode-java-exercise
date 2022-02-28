package indi.sky.dataStructure;

/**
 * 树节点
 */
public class TreeNode {
    public Object data;
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(Object data) {
        this.data = data;
    }
    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

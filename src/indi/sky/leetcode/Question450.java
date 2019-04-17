package indi.sky.leetcode;

import indi.sky.dataStructure.TreeNode;

import javax.xml.soap.Node;

/**
 * 450. 删除二叉搜索树中的节点
 */
public class Question450 {
    /**
     * Description : 删除二叉搜索树中的指定节点
     * @param root 目标二叉树的根节点
     * @param key  要删除的数据
     * 扩展: 二叉搜索树: 左子树 < 节点 < you子树
     *
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode keyNode = findNode(root,key);

        return keyNode;
    }

    public TreeNode findNode(TreeNode root, int key){
        if (root == null){
            return null;
        }
        TreeNode tree = root;
        if (root.val < key){
            tree = findNode(root.right,key);
        }else if (root.val > key){
            tree = findNode(root.left,key);
        }else {
            tree = root;
        }
        return tree;
    }




    public static void main(String[] args){
        Question450 quertion = new Question450();
        TreeNode tree = new TreeNode(5);
        tree.left = new TreeNode(3);
        tree.right = new TreeNode(6);
        tree.left.left = new TreeNode(2);
        tree.left.right = new TreeNode(4);
        tree.right.right = new TreeNode(7);
        TreeNode res = quertion.findNode(tree,3);
        System.out.println(res);
    }
}

package indi.sky.leetcode;

import indi.sky.util.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * 589. N 叉树的前序遍历
 */
public class Question589 {
    List<Integer> list;
    public List<Integer> preorder(Node root) {
        list = new ArrayList<>();
        order(root);
        return list;
    }

    public void order(Node root){
        if (root == null){
            return ;
        }
        list.add(root.val);
        for (Node node : root.children){
            order(node);
        }
    }
}

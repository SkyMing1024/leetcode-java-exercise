package indi.sky.leetcode;

import indi.sky.dataStructure.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * 429. N 叉树的层序遍历
 */
public class Question429 {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        levelOrder(res, 0, root);
        return res;
    }

    private void levelOrder(List<List<Integer>> res, int level, Node root) {
        int index = level+1;
        if (root == null) {
            return;
        }
        if (res.size() < index) {
            res.add(new ArrayList<Integer>());
        }
        res.get(level).add(root.val);
        int childrenSize = root.children.size();
        for (int j = 0; j < childrenSize; j++){
            levelOrder(res, index, root.children.get(j));
        }
    }

}

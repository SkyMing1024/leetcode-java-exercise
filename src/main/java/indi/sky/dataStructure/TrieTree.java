package indi.sky.dataStructure;

/**
 * Description :
 * Trie树的实现
 * 主要操作
 * 1. 插入字符串
 * 2. 查找字符串
 */
public class TrieTree {
    // 存储无意义字符
    private TrieNode root = new TrieNode('/');

    public void insert(char[] text) {
        TrieNode p = root;
        for (int i = 0; i < text.length; ++i) {
            int index = text[i] - 'a';
            if (p.children[index] == null) {
                TrieNode newNode = new TrieNode(text[i]);
                p.children[index] = newNode;
            }
            p = p.children[index];
        }
        p.isEndingChar = true;
    }

    public boolean find(char[] pattern) {
        TrieNode p = root;
        for (int i = 0; i < pattern.length; ++i) {
            int index = pattern[i] - 'a';
            if (p.children[index] == null) {
                return false; // 不存在 pattern
            }
            p = p.children[index];
        }
        if (p.isEndingChar == false) {
            return false; // 不能完全匹配，只是前缀
        }else {
            return true; // 找到 pattern
        }
    }

    public class TrieNode {
        public char data;
        // 子节点
        public TrieNode[] children = new TrieNode[26];
        // 是否是叶子节点
        public boolean isEndingChar = false;
        public TrieNode(char data) {
            this.data = data;
        }
    }
}


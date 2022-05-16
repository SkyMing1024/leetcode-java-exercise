package indi.sky.leetcode_vs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=208 lang=java
 *
 * [208] 实现 Trie (前缀树)
 *
 * https://leetcode-cn.com/problems/implement-trie-prefix-tree/description/
 *
 * algorithms
 * Medium (71.86%)
 * Likes:    1149
 * Dislikes: 0
 * Total Accepted:    187.9K
 * Total Submissions: 261.5K
 * Testcase Example:  '["Trie","insert","search","search","startsWith","insert","search"]\n' +
  '[[],["apple"],["apple"],["app"],["app"],["app"],["app"]]'
 *
 * Trie（发音类似 "try"）或者说 前缀树
 * 是一种树形数据结构，用于高效地存储和检索字符串数据集中的键。这一数据结构有相当多的应用情景，例如自动补完和拼写检查。
 * 
 * 请你实现 Trie 类：
 * 
 * 
 * Trie() 初始化前缀树对象。
 * void insert(String word) 向前缀树中插入字符串 word 。
 * boolean search(String word) 如果字符串 word 在前缀树中，返回 true（即，在检索之前已经插入）；否则，返回
 * false 。
 * boolean startsWith(String prefix) 如果之前已经插入的字符串 word 的前缀之一为 prefix ，返回 true
 * ；否则，返回 false 。
 * 
 * 
 * 
 * 
 * 示例：
 * 
 * 
 * 输入
 * ["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
 * [[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
 * 输出
 * [null, null, true, false, true, null, true]
 * 
 * 解释
 * Trie trie = new Trie();
 * trie.insert("apple");
 * trie.search("apple");   // 返回 True
 * trie.search("app");     // 返回 False
 * trie.startsWith("app"); // 返回 True
 * trie.insert("app");
 * trie.search("app");     // 返回 True
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 
 * word 和 prefix 仅由小写英文字母组成
 * insert、search 和 startsWith 调用次数 总计 不超过 3 * 10^4 次
 * 
 * 
 */

// @lc code=start
class Trie {

    private Character value;
    private HashMap<Character,Trie> children;
    private boolean isEnd;
    private int count;

    public Trie(Character value,HashMap<Character,Trie> children){
        this.value = value;
        this.children = children;
    }

    public Trie(Character value){
        this.value = value;
        children = new HashMap<>();
    }

    public Trie() {
        children = new HashMap<>();
    }
    
    public void insert(String word) {
        if(word == null || word.equals("")){
            return;
        }
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            Trie current = node.children.get(ch);
            if(current == null){
                node.children.put(ch, new Trie(ch));
            }
            node = node.children.get(ch);
            
        }




    }
    
    public boolean search(String word) {


        return false;
    }
    
    public boolean startsWith(String prefix) {

        return false;
    }
    
    private void print(){
        Trie root = this;
        if (root.children!=null){
            HashMap<Character, Trie> children = root.children;
            Set<Character> ch = children.keySet();
            Iterator<Character> iterator = ch.iterator();
            while (iterator.hasNext()){
                System.out.print(this.value);
                Trie trie = children.get(iterator.next());
                trie.print();
            }
            System.out.println("");

        }
        
    }


    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("word");
        trie.insert("wait");
        trie.print();


    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
// @lc code=end


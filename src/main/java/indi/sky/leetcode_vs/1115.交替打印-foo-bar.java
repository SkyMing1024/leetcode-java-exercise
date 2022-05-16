package indi.sky.leetcode_vs;/*
 * @lc app=leetcode.cn id=1115 lang=java
 *
 * [1115] 交替打印 FooBar
 *
 * https://leetcode-cn.com/problems/print-foobar-alternately/description/
 *
 * concurrency
 * Medium (56.20%)
 * Likes:    154
 * Dislikes: 0
 * Total Accepted:    50.1K
 * Total Submissions: 89.2K
 * Testcase Example:  '1'
 *
 * 给你一个类：
 * 
 * 
 * class FooBar {
 * ⁠ public void foo() {
 * for (int i = 0; i < n; i++) {
 * print("foo");
 * }
 * ⁠ }
 * 
 * ⁠ public void bar() {
 * for (int i = 0; i < n; i++) {
 * print("bar");
 * }
 * ⁠ }
 * }
 * 
 * 
 * 两个不同的线程将会共用一个 FooBar 实例：
 * 
 * 
 * 线程 A 将会调用 foo() 方法，而
 * 线程 B 将会调用 bar() 方法
 * 
 * 
 * 请设计修改程序，以确保 "foobar" 被输出 n 次。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：n = 1
 * 输出："foobar"
 * 解释：这里有两个线程被异步启动。其中一个调用 foo() 方法, 另一个调用 bar() 方法，"foobar" 将被输出一次。
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：n = 2
 * 输出："foobarfoobar"
 * 解释："foobar" 将被输出两次。
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= n <= 1000
 * 
 * 
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// @lc code=start
class FooBar {
    private int n;

    private Object lock = new Object();

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        synchronized (lock) {

            for (int i = 0; i < n; i++) {

                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();

                lock.notifyAll();

                lock.wait();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        synchronized (lock) {
            for (int i = 0; i < n; i++) {

                // printBar.run() outputs "bar". Do not change or remove this line.
                printBar.run();

                lock.notifyAll();

                lock.wait();
            }
        }
    }
    static FooBar fun = new FooBar(10);
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    FooBar.fun.foo(new Runnable() {
                        @Override
                        public void run() {
                            System.out.print("foo ");
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    FooBar.fun.bar(new Runnable() {
                        @Override
                        public void run() {
                            System.out.println("bar");
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
// @lc code=end

class FooBar2 {
    private int n;
    Lock lock =new ReentrantLock();
    Condition condition = lock.newCondition();
    public FooBar2(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                printFoo.run();
                // printFoo.run() outputs "foo". Do not change or remove this line.
            }
    }

    public void bar(Runnable printBar) throws InterruptedException {

            for (int i = 0; i < n; i++) {
                printBar.run();
                // printBar.run() outputs "bar". Do not change or remove this line.
            }
    }

    static FooBar2 fun = new FooBar2(10);
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    FooBar2.fun.foo(new Runnable() {
                        @Override
                        public void run() {
                            System.out.print("foo ");
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    FooBar2.fun.bar(new Runnable() {
                        @Override
                        public void run() {
                            System.out.println("bar");
                        }
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
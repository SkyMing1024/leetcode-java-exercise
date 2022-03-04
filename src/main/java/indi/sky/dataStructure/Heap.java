package indi.sky.dataStructure;

/**
 * 堆
 */
public class Heap {
    // 存储数据的数组, 从下标1开始存
    // 方便和二叉树对应
    public int[] a;
    // 堆可以存储的最大个数
    public int n;
    // 已经存储的数据个数
    public int count;

    public Heap(int capacity) {
        a = new int[capacity + 1];
        n = capacity;
        count = 0;
    }

    public void insert(int data) {
        if (count >= n) return; // 堆满了
        ++count;
        a[count] = data;
        int i = count;
        while (i/2 > 0 && a[i] > a[i/2]) { // 自下往上堆化
//            swap() 函数作用：交换下标为 i 和 i/2 的两个元素
//            swap(a, i, i/2);
            int temp = a[i];
            a[i] = a[i/2];
            a[i/2] = temp;

            i = i/2;
        }
    }


    public void removeMax() {
        if (count == 0) return ; // 堆中没有数据
        a[1] = a[count];
        --count;
        heapify(a, count, 1);
    }

    // 自上往下堆化
    private void heapify(int[] a, int n, int i) {
        while (true) {
            int maxPos = i;
            if (i*2 <= n && a[i] < a[i*2]) {maxPos = i*2;}
            if (i*2+1 <= n && a[maxPos] < a[i*2+1]) {maxPos = i*2+1;}
            if (maxPos == i) break;
//            swap(a, i, maxPos);
            int temp = a[i];
            a[i] = a[maxPos];
            a[maxPos] = temp;
            i = maxPos;
        }
    }

}

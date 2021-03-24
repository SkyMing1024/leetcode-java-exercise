package indi.sky.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public void bubbleSort(int[] arr, int n){
        for (int i = 0; i < n ; i++) {
            boolean flag = false;
            for (int j = 0; j < n-(i+1) ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                    flag = true;
                }
            }
            // 没有数据交换, 退出循环
            if (!flag){
                break;
            }
        }
    }

    public static void main(String[] args){
        BubbleSort b = new BubbleSort();
        int[] arr = {5,1,3,2,4,6};
        System.out.println(arr.toString());
        b.bubbleSort(arr,arr.length);
        System.out.println(arr);
    }
}

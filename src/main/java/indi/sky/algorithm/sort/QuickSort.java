package indi.sky.algorithm.sort;

import indi.sky.util.CommonUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,9,4,3,7};
        QuickSort.quickSort(arr,0,arr.length-1);

        CommonUtil.printArrayInLine(arr);
    }

    /**
     *
     * @param arr
     * @return
     */
    public static int[] sort(int[] arr){
        quickSort2(arr);
        return arr;
    }

    /*
        8,3,9,4,2,6,7,1
        pivot = 8，left=0,right=7
     */
    public static void quickSort(int[] arr, int left, int right){
        int l = left, r = right;
        if (l<r){
            /*
            此方法需要注意执行 pivot取值和执行顺序的关系
            pivot 取值是 arr[r]，最右侧的值，while循环里，遍历时先判断左侧的
             */
            int pivot = arr[r];
            while (l < r){
                while (l<r && arr[l]<pivot){
                    l++;
                }
                if (l<r){
                    arr[r] = arr[l];
                    r--;
                }

                while (l<r && arr[r]>pivot){
                    r--;
                }
                if (l<r){
                    arr[l] = arr[r];
                    l++;
                }
            }
            arr[l]=pivot;
            quickSort(arr,left,l-1);
            quickSort(arr,r+1,right);
        }

    }

    public static void quickSort2(int[] arr){
//        if (arr.length<=1)return;
        int pivot = arr[(arr.length-1)/2];

        ArrayList<Integer> left  = new ArrayList<>();
        ArrayList<Integer> right  = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<pivot){
                left.add(arr[i]);
            }else {
                right.add(arr[i]);
            }
        }
        quickSort2(toArray(left));
        quickSort2(toArray(right));
    }

    private static int[] toArray(ArrayList<Integer> list){
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}

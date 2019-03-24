package indi.sky.algorithm.sort;

public class Sort {

    /**
     * Description : 冒泡排序
     */
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

    /**
     * Description : 插入排序
     */
    public void insertionSort(int[] arr, int n){
        for (int i = 1; i < n; i++) {
            int val = arr[i];
            int j = i-1;
            for (; j >=0 ; j--) {
                // 变量val中存入此次循环要插入的元素, 比较时只能与val进行比较而不能与arr[i]比较, 因为排序过程中arr[i]的值可能改变
                if (arr[j] > val){
                      arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = val;
        }
    }

    /**
     * Description : 选择排序
     */
    public void selecttionSort(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            int x = i;
            for (int j = i; j < n ; j++) {
                if (arr[x]>arr[j]){
                    x = j;
                }
                // 交换arr[x],arr[i]
                int temp = arr[i];
                arr[i] = arr[x];
                arr[x] = temp;
            }
        }


    }

    public void printArray(int[] arr){
        String res = "[";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i]+",";
        }
        res = res.substring(0,res.lastIndexOf(","));
        System.out.println(res+"]");
    }

    public static void main(String[] args){
        Sort  sort = new Sort();
        int[] arr = {5,1,3,2,4,6};
        int a = 3, b = 4;

        sort.printArray(arr);
        sort.insertionSort(arr,arr.length);
        sort.printArray(arr);
    }
}

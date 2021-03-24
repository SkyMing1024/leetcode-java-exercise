package indi.sky.algorithm.sort;

/**
 * 插入排序
 * 将数组分为两部分，左边已排序、右边未排序，每次从
 */
public class InsertSort implements ISortArray{
    @Override
    public int[] sort(int[] array) {
        int n = array.length;
        if (n<1) return array;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i-1; j++) {
                if (array[i]<array[j]){
                    array[i] = array[j];
                }
            }

        }

        return new int[0];
    }
}

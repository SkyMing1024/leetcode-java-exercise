package indi.sky.util;

public class CommonUtil {
    public static void printMatrixArray(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < arr[i].length; j++) {
                str.append(arr[i][j]+"\t");
            }
            System.out.println(str.toString());
        }
    }
}

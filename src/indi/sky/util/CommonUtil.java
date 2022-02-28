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


    /**
     * 判断一个字符串是否是回文
     * @param s
     * @return
     */
    public static boolean isPalinromel(String s){
        boolean flag = true;
        int start = 0;
        int end = s.length()-1;
        for (int i = 0; start<=end; start++,end--) {
            if (s.charAt(start) != s.charAt(end)){
                flag = false;
                break;
            }
        }
        return flag;
    }


    /**
     * 判断字符串的[start,end)子串是不是回文
     * @param s
     * @param start
     * @param end
     * @return
     */
    public static boolean isPalinromel(String s, int start, int end){
        for (int i = start,j=end; i<=j ; i++,j--) {
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void printArrayInLine(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\r");
    }
}

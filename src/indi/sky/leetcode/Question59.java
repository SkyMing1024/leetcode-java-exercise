package indi.sky.leetcode;

/**
 * 59. 螺旋矩阵 II
 */
public class Question59 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int p = 1,weight = n,height = n,startRow = 0,startCol = 0;
        while (true){
            if (p > n*n)break;
            // 上边界
            for (int i = startCol; i < startCol+weight; i++) {
                res[startRow][i] = p++;
            }
            startRow++;
            height--;

            // 右边界
            if (p > n*n)break;
            for (int i = startRow; i < startRow+height; i++) {
                res[i][startCol+weight-1] = p++;
            }
            weight--;

            // 下边界
            if (p > n*n)break;
            for (int i = startCol+weight-1; i >=startCol ; i--) {
                res[startRow+height-1][i] = p++;
            }
            height--;

            // 左边界
            if (p > n*n)break;
            for (int i = startRow+height-1; i >= startRow ; i--) {
                res[i][startCol] = p++;
            }
            startCol++;
            weight--;
        }

        return res;
    }
}

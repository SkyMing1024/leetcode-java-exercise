package indi.sky.leetcode;

/**
 * 59. 螺旋矩阵 II
 */
public class Question59 {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int p = 0,weight = n,height = n,startRow = 0,startCol = 0;
        while (true){
            if (p >= n*n)break;
            for (int i = startCol; i < weight; i++) {res[startRow][i] = p++;}
            startRow++;
            height--;
            for (int i = startRow; i < height; i++) {
                res[startCol+weight-1][i] = p++;
            }
            weight--;
            for (int i = startCol+weight-1; i >=startCol ; i--) {
                res[startRow+height-1][i] = p++;
            }
            height--;
            for (int i = startRow+height-1; i >= startRow ; i--) {
                res[i][startCol] = p++;
            }
            startCol++;
            height--;
        }

        return res;
    }
}

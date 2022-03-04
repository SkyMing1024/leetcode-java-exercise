package indi.sky.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 54. 螺旋矩阵
 */
public class Question54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length ==0) return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int height = matrix.length,weight = matrix[0].length;
        int startRow = 0,startCol = 0,p = 0;
        while (true){
            // 上边界
            if (height == 0 || weight == 0){break;}
            for (int c = startCol; c < startCol+weight; c++) {result.add(matrix[startRow][c]);}
            startRow++;
            height--;
            // 右边界
            if (height == 0 || weight == 0){break;}
            for (int r = startRow; r < startRow+height ; r++) {result.add(matrix[r][startCol+weight-1]);}
            weight--;
            // 下边界
            if (height == 0 || weight == 0){break;}
            for (int c = startCol+weight-1; c >= startCol ; c--) {result.add(matrix[startRow+height-1][c]);}
            height--;
            // 左边界
            for (int r = startRow + height-1; r >= startRow ; r--) {result.add(matrix[r][startCol]);}
            weight--;
            startCol++;
        }
        return result;
    }
}

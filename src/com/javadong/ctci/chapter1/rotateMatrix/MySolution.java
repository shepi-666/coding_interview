package com.javadong.ctci.chapter1.rotateMatrix;

import org.junit.Test;

/**
 * 给定一幅由 N × N矩阵表示的图像，其中每个像素的大小为 4字节，编写一种
 * 方法，将图像旋转 90度。
 */
public class MySolution {
    /**
     * 最优题解：如何将一张照片顺时针旋转90度？？？
     * 先沿着主对角线将照片翻到反面
     * 在从左到右将照片翻到正面
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // 按照主对角线反转
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        // 左右反转
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = tmp;
            }
        }

    }

    @Test
    public void testSolution() {
        int[][] matrix = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotate(matrix);
    }
}

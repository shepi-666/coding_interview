package com.javadong.ctci.chapter1.zeroMatrix;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 编写一种算法，若 M × N矩阵中某个元素为 0，则将其所在的行与列清零。
 */
public class MySolution {
    private int[][] matrix;
    public void setZeroes(int[][] matrix) {
        if (matrix.length == 0 ||matrix[0].length == 0) return;
        this.matrix = matrix;
        boolean[] rows = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        List<List<Integer>> marks = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(i);
                    tmp.add(j);
                    marks.add(tmp);
                }
            }
        }

        for (List<Integer> tmp : marks) {
            if (!rows[tmp.get(0)]) {
                setRow(tmp.get(0));
                rows[tmp.get(0)] = true;
            }
            if (!column[tmp.get(1)]) {
                setColumn(tmp.get(1));
                column[tmp.get(1)] = true;
            }
        }
    }

    private void setColumn(Integer integer) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][integer] = 0;
        }
    }
    private void setRow(Integer integer) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[integer][i] = 0;
        }
    }


    @Test
    public void testSolution() {
        int[][] matrix = new int[][] {

            {0,1,2,0},
            {3,4,5,2},
            {1,3,1,5}
        };

        setZeroes(matrix);
    }
}

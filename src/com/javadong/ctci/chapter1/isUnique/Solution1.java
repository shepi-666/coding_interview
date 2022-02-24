package com.javadong.ctci.chapter1.isUnique;

import org.junit.Test;

public class Solution1 {
    /**
     * 使用双指针的方式
     * 时间复杂度：O(N^2)
     * @param astr
     * @return
     */
    public boolean isUnique(String astr) {
        if (astr == null || astr.length() == 0) return true;
        for (int i = 0; i < astr.length(); i++) {
            for (int j = i + 1; j < astr.length(); j++) {
                if (astr.charAt(i) == astr.charAt(j)) return false;
            }
        }
        return true;
    }

    @Test
    public void testSolution() {
        System.out.println(isUnique("leetcode"));
    }
}

package com.javadong.ctci.chapter1.checkPermutation;

import org.junit.Test;

/**
 * 给定两个字符串，请编写程序，确定其中一个字符串的字符重
 * 新排列后，能否变成另一个字符串
 */
public class MySolution {
    /**
     * 根据唯一字符的启发，使用位运算来实现(实现不了，因为二进制有重复的会进位)
     * @param s1
     * @param s2
     * @return
     */
    public boolean CheckPermutation(String s1, String s2) {
        // 特殊情况的判断
        if ((s1 == null && s2 != null) || (s2 == null && s1 != null)) return false;
        if (s1 == null ) return true;

        int[] flags = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            flags[s1.charAt(i)] ++;
        }

        for (int i = 0; i < s2.length(); i++) {
            flags[s2.charAt(i)] --;
        }

        for (int i = 0; i < flags.length; i++) {
            if (flags[i] != 0) return false;
        }
        return true;


    }

    @Test
    public void testSolution() {
        System.out.println(CheckPermutation("aab", "abb"));
    }
}

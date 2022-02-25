package com.javadong.ctci.chapter1.permutePalindrome;


import org.junit.Test;

/**
 * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一
 * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
 * 回文串不一定是字典当中的单词
 */
public class MySolution {
    public boolean canPermutePalindrome(String s) {
        if (s == null || s.length() <= 1) return true;
        // 先将字符串换为小写
        int[] flags = new int[128];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            flags[chars[i]] ++;
        }

        int count = 0;
        for (int i = 0; i < flags.length; i++) {
            if (flags[i] % 2 == 1) count ++;
        }

        return (s.length() % 2 == 0)
                ? (count == 0) : (count == 1);

    }

    @Test
    public void testSolution() {
        System.out.println(canPermutePalindrome("aaa"));
    }
}

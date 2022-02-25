package com.javadong.ctci.chapter1.URL_coding;

import org.junit.Test;

public class Solution {
    public String replaceSpaces(String S, int length) {
        char[] chars = S.toCharArray();
        // 在上面这个数组上实现URL化
        int i = S.length() - 1;
        for (int j = length - 1; j >= 0; j--) {
            if (chars[j] == ' ') {
                chars[i--] = '0';
                chars[i--] = '2';
                chars[i--] = '%';
            } else {
                chars[i--] = chars[j];
            }
        }
        return String.valueOf(chars, i + 1, S.length() - i - 1);
    }

    @Test
    public void testSolution() {
        System.out.println(replaceSpaces("Mr John Smith    ", 13));
    }
}

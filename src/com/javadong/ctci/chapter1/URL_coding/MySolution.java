package com.javadong.ctci.chapter1.URL_coding;

import org.junit.Test;

/**
 * 编写一种方法，将字符串中的空格全部替换为 %20 。假定该字符串尾部有足够
 * 的空间存放新增字符，并且知道字符串的“真实”长度。
 */
public class MySolution {
    public String replaceSpaces(String S, int length) {
        if (S == null || S.length() == 0) return "";
        S = S.substring(0, length);
        char[] chars = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c == ' ' ? "%20" : c);
        }
        return sb.toString();
    }

    @Test
    public void testSolution() {
        System.out.println(replaceSpaces("Mr John Smith  ", 13));
    }
}

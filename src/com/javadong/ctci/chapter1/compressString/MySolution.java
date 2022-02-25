package com.javadong.ctci.chapter1.compressString;

import org.junit.Test;

/**
 * 利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
 * 比如，字符串 aabcccccaaa 会变为 a2b1c5a3 。
 */
public class MySolution {
    public String compressString(String S) {
        if (S == null || S.length() < 1) return S;
        StringBuilder sb = new StringBuilder();
        sb.append(S.charAt(0));
        int count = 1;
        for (int i = 1; i < S.length(); i++) {
            while (i < S.length() && (S.charAt(i) == S.charAt(i - 1))) {
                count++; i++;
            }
            sb.append(count);
            count = 1;
            if (i < S.length()) sb.append(S.charAt(i));
            if (i == S.length() - 1) sb.append(count);
        }
        return sb.toString().length() < S.length() ?
                sb.toString() : S;
    }

    @Test
    public void testSolution() {
        System.out.println(compressString("lllhU"));
    }
}

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
        int j = 0;
        for (int i = 0; i < S.length(); ) {
            while (j < S.length() && S.charAt(i) == S.charAt(j)) {
                j ++ ;
            }
            sb.append(S.charAt(i)).append(j - i);
            i = j;
        }
        return sb.toString().length() < S.length() ?
                sb.toString() : S;
    }

    @Test
    public void testSolution() {
        System.out.println(compressString("asaaajjjjjjjjhhhhhhhlllhU"));
    }
}

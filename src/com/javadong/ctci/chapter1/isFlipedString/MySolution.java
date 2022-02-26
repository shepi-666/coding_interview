package com.javadong.ctci.chapter1.isFlipedString;

import org.junit.Test;

/**
 * 给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成
 * （比如，waterbottle是erbottlewat旋转后的字符串）。
 *
 * a a a c    a c a a
 *
 * s2 + s2 : A C a a a c A A
 */
public class MySolution {
    public boolean isFlipedString(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        if (s1.length() != s2.length()) return false;


        String ss = s2 + s2;
        return ss.contains(s1);
    }

    @Test
    public void testSolution() {
        System.out.println(isFlipedString("aaac", "acaa"));
    }
}

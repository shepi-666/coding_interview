package com.javadong.ctci.chapter1.isUnique;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * 实现一个算法，确定一个字符串的所有字符是否全都不同。假使不
 * 允许使用额外的数据结构，又该如何处理
 */
public class MySolution {
    /**
     * 将每一个字符存储在一个Map集合中, 使用了额外的空间
     * @param s
     * @return
     */
    public boolean isUnique(String s) {
        if (s == null || s.length() == 0) return true;
        Set<Character> chars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (chars.contains(s.charAt(i))) {
                return false;
            } else {
                chars.add(s.charAt(i));
            }
        }
        return true;
    }

    @Test
    public void testSolution() {
        System.out.println(isUnique("abcad"));
    }
}

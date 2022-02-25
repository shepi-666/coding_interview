package com.javadong.ctci.chapter1.permutePalindrome;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean canPermutePalindrome(String s) {
        if (s == null || s.length() <= 1) return true;
        String s1 = s.toLowerCase();
        char[] chars = s1.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            boolean b = set.contains(chars[i]) ? set.remove(chars[i]) : set.add(chars[i]);
        }

        return chars.length % 2 == 0 ?
                (set.size() == 0) : (set.size() == 1);
    }

    @Test
    public void testSolution() {
        System.out.println(canPermutePalindrome("tactcoa"));
    }
}

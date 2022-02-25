package com.javadong.ctci.chapter1.oneEditAway;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 字符串有三种编辑操作：插入一个字符、删除一个字符或者替换一个字符。
 * 给定两个字符串，编写一个函数判定它们是否只需要一次（或者零次）编辑。
 */
public class MySolution {
    public boolean oneEditAway(String first, String second) {
        if (Math.abs(first.length() - second.length()) > 1) return false;
        if (first.length() == 0 || second.length() == 0) return true;
        return compare(first, second);



    }

    public boolean compare(String s1, String s2) {
        boolean flag1 = s1.length() == s2.length();
        boolean flag2 = true; // 执行删除操作的标志[还未执行删除操作]
        int count = 0;
        int j = 0;
        for (int i = 0; i < s1.length() && j < s2.length(); i++) {
            if (s1.charAt(i) != s2.charAt(j)) {
                if (flag1) count ++;
                else {
                    if (flag2) { // 某个字符第一次不一样并且两个字符串不一样长度，执行删除操作
                        int mark = s1.length() > s2.length() ? j-- : i--;
                        flag2 = false; // 已经执行过删除
                        flag1 = true; // 执行删除，两个字符串长度一样
                        count ++; // 操作次数加1
                    }
                }
            }
            if (count > 1) return false;
            j ++;
        }
        return true;
    }

    @Test
    public void testSolution() {
        System.out.println(oneEditAway("attacher", "karma"));
    }
}

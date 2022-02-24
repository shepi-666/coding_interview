package com.javadong.ctci.chapter1.isUnique;

public class Solution2 {

    /**
     * 位运算
     * @param astr 假设字符是26个小写字母
     * @return
     */
    public boolean isUnique(String astr) {
        if (astr == null || astr.length() == 0) return true;
        if (astr.length() > 26) return false;

        // 假设有26个字母，如果使用数组的话，需要26长度的数组来记录位置
        // 我们可以使用一个int类型的变量来记录字符出现的位置
        int checker = 0;
        for (int i = 0; i < astr.length(); i++) {
            int val = astr.charAt(i) - 'a';
            // 将比特位 1 移动到字符所在的位置 并且和checker相与判断是否有重复
            if ((checker & (1 << val)) > 0) return false;
            // 将对应比特位进行标记
            checker |= val;
        }
        return true;
    }
}

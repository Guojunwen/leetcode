package com.guo.leetcode.practice;

import com.guo.leetcode.annitation.Practice;

public class ToLowerCase {
    /**
     * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
     *
     * @param str
     * @return
     */
    @Practice(name = "大写转小写",url = "")
    public static String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i=0; i< chars.length;i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
        System.out.println(toLowerCase("here"));
        System.out.println(toLowerCase("LOVELY"));
    }
}

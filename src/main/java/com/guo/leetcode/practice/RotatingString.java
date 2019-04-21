package com.guo.leetcode.practice;

import com.guo.leetcode.annitation.Practice;

public class RotatingString {
    /**
     * 给定两个字符串, A 和 B。
     * A 的旋转操作就是将 A 最左边的字符移动到最右边。 例如, 若 A = 'abcde'，在移动一次之后结果就是'bcdea' 。如果在若干次旋转操作之后，A 能变成B，那么返回True。
     */
    @Practice(name = "旋转字符串", url = "https://leetcode-cn.com/problems/rotate-string/")
    public static boolean rotateString(String A, String B) {
        return (A.length() == B.length()) && (A + A).contains(B);
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
        System.out.println(rotateString("abcde", "abced"));
    }
}

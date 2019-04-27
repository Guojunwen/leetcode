package com.guo.leetcode.practice;

import com.guo.leetcode.annitation.Practice;

public class CanConstruct {
    /**
     * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。
     * 如果可以构成，返回 true ；否则返回 false。
     */
    @Practice(name = "赎金信", url = "https://leetcode-cn.com/problems/ransom-note/")
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] temp = new int[26];
        char[] rans = ransomNote.toCharArray();
        char[] mags = magazine.toCharArray();
        for (int i = 0; i < mags.length; i++) {
            temp[mags[i] - 'a']++;
        }
        for (int j = 0; j < rans.length; j++) {
            temp[rans[j] - 'a']--;
            if (temp[rans[j] - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }
}

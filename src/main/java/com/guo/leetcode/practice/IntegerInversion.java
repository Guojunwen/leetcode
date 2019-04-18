package com.guo.leetcode.practice;

import com.guo.leetcode.annitation.Practice;

public class IntegerInversion {

//    给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
//    示例 1:
//
//    输入: 123
//    输出: 321
//    示例 2:
//
//    输入: -123
//    输出: -321
//    示例 3:
//
//    输入: 120
//    输出: 21
//    注意:
//
//    假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
    @Practice(name = "整数反转",url = "")
    public static int reverse(int x) {

        if (x < 10 && x > -10) {
            return x;
        }
        if (x < Integer.MIN_VALUE || x > Integer.MAX_VALUE) {
            return 0;
        }

        char[] chars = String.valueOf(x).toCharArray();
        if (chars[0] != '-') {
            for (int i = 0, length = chars.length; i < length / 2; i++) {
                char temp = chars[i];
                chars[i] = chars[length - i - 1];
                chars[length - i - 1] = temp;
            }
        } else {
            for (int i = 1, length = chars.length - 1; i <= length / 2; i++) {
                char temp = chars[i];
                chars[i] = chars[length - i + 1];
                chars[length - i + 1] = temp;
            }
        }
        try {
            return Integer.valueOf(String.valueOf(chars));
        } catch (Exception e) {
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(1234));
        System.out.println(reverse(12345));
        System.out.println(reverse(123456));
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-123));
        System.out.println(reverse(-1234));
        System.out.println(reverse(-12345));
        System.out.println(reverse(-123456));
    }
}

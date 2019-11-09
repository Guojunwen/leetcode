package com.guo.leetcode.practice;

import com.guo.leetcode.annitation.Practice;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    /**
     * 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
     * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
     * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
     * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
     * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
     * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
     */
    @Practice(name = "罗马数字转整数", url = "https://leetcode-cn.com/problems/roman-to-integer/")
    public static int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        int result = 0;
        if (!StringUtils.isEmpty(s)) {
            char[] array = s.toCharArray();
            for (int index = 0; index < array.length; index++) {
                if (index == 0) {
                    result = map.get(String.valueOf(array[index]));
                    continue;
                }
                int now = map.get(String.valueOf(array[index]));
                int last = map.get(String.valueOf(array[index - 1]));
                if (now <= last) {
                    result += now;
                } else {
                    result = result + now - last - last;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}

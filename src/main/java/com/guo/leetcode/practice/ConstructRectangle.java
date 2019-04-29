package com.guo.leetcode.practice;

import com.guo.leetcode.annitation.Practice;

public class ConstructRectangle {

    @Practice(name = "构造矩形", url = "https://leetcode-cn.com/problems/construct-the-rectangle/")
    public static int[] constructRectangle(int area) {
        int w = 0;
        int l = 0;
        for (w = (int) Math.sqrt(area); w > 0; w--) {
            if (area % w == 0) {
                l = area / w;
                return new int[]{l, w};
            }
        }
        return new int[]{l, w};
    }

    public static void main(String[] args) {
        int[] temp=constructRectangle(9);
        System.out.println(temp[0]+","+temp[1]);
    }
}

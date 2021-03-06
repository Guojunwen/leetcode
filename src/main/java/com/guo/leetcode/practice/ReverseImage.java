package com.guo.leetcode.practice;

import com.guo.leetcode.annitation.Practice;

public class ReverseImage {
    /**
     * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
     * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
     * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
     */
    @Practice(name = "翻转图像",url = "https://leetcode-cn.com/problems/flipping-an-image/")
    public static int[][] flipAndInvertImage(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0, len = a[i].length; j < len / 2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][len - j - 1];
                a[i][len - j - 1] = temp;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0, len = a[i].length; j < len ; j++) {
                a[i][j]=a[i][j]== 1 ? 0 : 1;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[][] test = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] result = flipAndInvertImage(test);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + ",");
            }
            System.out.println();
        }
    }
}

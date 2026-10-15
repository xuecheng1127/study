package com.aust.loopoop;

public class test2 {
    //打印正三角形和倒三角形
    public static void main(String[] args) {
        //打印正三角形
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //打印倒三角形
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //打印等腰三角形
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //打印平行四边形
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //打印梯形
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //打印菱形
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 2; i >= 1; i--) {
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        //打印空心菱形
        int n = 7;              // 总行数，用奇数
        int mid = n / 2 + 1;    // 中间行，这里 mid = 4

// 上半部分（含中间行）：i = 1 ~ 4
        for (int i = 1; i <= mid; i++) {
            // 前导空格：mid - i 个
            for (int j = 1; j <= mid - i; j++) {
                System.out.print(" ");
            }
            // 星号区宽度：2 * i - 1，只打两端
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

// 下半部分：i = 1 ~ 3
        for (int i = 1; i <= mid - 1; i++) {
            // 前导空格：i 个
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // 星号区宽度：2 * (mid - i) - 1，只打两端
            for (int j = 1; j <= 2 * (mid - i) - 1; j++) {
                if (j == 1 || j == 2 * (mid - i) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

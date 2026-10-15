package com.aust.method;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[10];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的成绩：");
            scores[i] = scanner.nextInt();
            if (scores[i] < 0 || scores[i] > 100) {
                System.out.println("输入的分数超出范围");
                i--;
            }
        }
        System.out.println("及格人数为：" + countPass(scores));
        System.out.println("总分为：" + sum(scores));
        System.out.println("平均分为：" + sum(scores) / scores.length);
        System.out.println("最高分为：" + max(scores));
    }
    /*班主任需要统计十名学生的数学成绩（0-100）
    计算及格率，平均分，并找出最高分
    1.键盘录入十名学生的成绩，存入数组。超出范围，提示“输入错误，请重新输入”
    2.定义方法，求及格人数，根据及格人数，求及格率
    3.定义方法求总分，根据总分求平均分
    4.定义方法，找出最高分
     */
    public static int countPass(int[] scores) {
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 60) {
                count++;
            }
        }
        return count;
    }
    public static int sum(int[] scores) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }
    public static int max(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }
}

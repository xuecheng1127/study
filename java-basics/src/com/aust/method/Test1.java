package com.aust.method;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        for(int i=0;i<scores.length;i++)
        {
            System.out.print("请输入第"+(i+1)+"个评委的分数：");
            scores[i] = scanner.nextInt();
            if (scores[i] < 0 || scores[i] > 100) {
                System.out.print("输入的分数超出范围，请重新输入：");
                i--;
            }
        }
        int a = max(scores);
        int b = min(scores);
        int sum=0;
        for(int i=0;i<scores.length;i++)
            sum+=scores[i];
        System.out.println("总分是："+sum);
        System.out.println("去掉一个最高分："+a+"，去掉一个最低分："+b+"，平均分是："+(sum-a-b)/3);

    }
    /*跳水比赛有五个评委打分，分数在零到一百之间，最终得分会去掉一个最高分，去掉一个最低分
    剩余的分数再求平均数，改平均数为选手最终得分
    要求1；利用键盘录入5个整数存入数组中，如果分数超出范围需要重新录入
    要求2；定义方法分别求数组的最大值和最小值
    要求3；计算5名评委的总分
    要求4；总分-最大值-最小值，求选手平均分
     */
    public static int max(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }
    public static int min(int[] scores) {
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return min;
    }

}

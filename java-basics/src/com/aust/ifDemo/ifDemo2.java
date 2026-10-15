package com.aust.ifDemo;
import java.util.Scanner;

public class ifDemo2 {
    public static void main(String[] args) {
        /* 计算电费
                电费计算采用阶梯计费原则，规则如下：
                1. 100度以下，每度0.5元
                2. 100-200度，每度0.6元
                3. 200度以上，每度0.7元999
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入使用度数：");
        int payment = sc.nextInt();
        if (payment < 100) {
            System.out.println("电费为：" + payment * 0.5);
        } else if (payment < 200) {
            System.out.println("电费为：" + (50 + (payment - 100) * 0.6));
        } else {
            System.out.println("电费为：" + (110 + (payment - 200) * 0.7));
        }

    }
}

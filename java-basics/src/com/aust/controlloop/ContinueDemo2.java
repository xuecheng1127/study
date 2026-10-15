package com.aust.controlloop;

public class ContinueDemo2 {
    public static void main(String[] args) {
        //循环打印1到100的数字，如果是包含七或者是七的倍数输出过字
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i / 10%10 == 7 || i % 10 == 7) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}

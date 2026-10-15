package com.aust.switchDemo;
import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args)  {
        System.out.println("请输入一个数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a=switch (num) {
                case 1 -> 10;
                case 2 -> 20;
                case 3 -> 30;
                default -> 0;
            };
        System.out.println(a);
    }
}

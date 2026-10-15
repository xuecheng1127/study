package com.aust.forDemo;
import java.util.Scanner;
public class forDemo3 {
    public static void main(String[] args) {
        /*键盘录入两个数字，表示一个范围
                统计这个范围内
                既能被三整除又能被五整除的数字有多少个*/
        System.out.println("请输入两个数字，表示一个范围：");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int max = (num1 > num2) ? num1 : num2;
        int min = (num1 > num2) ? num2 : num1;
        int count = 0;
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
        System.out.println("既能被三整除又能被五整除的数字有：" + count + "个");
    }
}

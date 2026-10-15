package com.aust.controlloop;

import java.util.Scanner;

public class Continuepractice {
   public static void main(String[] args) {
       //第一个人从一开始数数，如若遇到数字含有四或者数字是四的倍数，则跳过这个数字报下一个，谁数错了就要罚酒一杯
       //牛牛为了作弊，想把所有符合规则的数字全部先生成出来，帮忙生成1到n之间所有既不包含4又不是4的倍数的整数
       System.out.println("请输入n的值：");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int count = 0;
       for (int i = 1; i <= n; i++) {
           if (i % 4 == 0 || i / 10%10 == 4 || i % 10 == 4) {
               continue;
           }
           System.out.println(i);
           count++;

       }
        System.out.println("1到"+n+"之间既不包含4又不是4的倍数的整数有"+count+"个");
    }

}

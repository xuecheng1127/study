package com.aust.Test;

import java.util.Random;

public class test2 {
    /*
    给你两个整数M和N，M表示红包的总额，N表示红包的个数
    现在又N个人来抽红包，每个人都是随机的，打印每个人领的红包金额
     */
    public static void main(String[] args) {
        int M = 100;
        int N = 10;
        Random r = new Random();
        int bound=100;
        for(int i=1;i<=N;i++) {
            if(i==10) {
                System.out.println("第10个人红包金额为：" + bound);
                break;
            }//要给剩余的人预留不能让别人一分抽不到，假设预留金额最低为一元
            //前一个人抽完后剩下的人为（N-i）个人
            //所以当前人的随机范围是[1,bound-(N-i)]
            int a = r.nextInt(1, bound-(N-i));
            System.out.println("第" + i + "个人抽的红包金额为：" + a);
            bound-=a;

        }
    }
    //缺陷；先拿的人往往比后拿的人更容易拿到更多的钱，可实现题目要求但是无法做到绝对公平
}

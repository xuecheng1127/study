package com.aust.whileDemo;

public class WhileDemo1 {
    public static void main(String[] args) {
       // 利用while语句实现游戏中的连续跳跃是十次，用输出语句模拟跳跃的逻辑
        int a = 0;
        int i = 1;
        while(i<=10){
            System.out.println("跳跃");
                    i++;
        }
    }
}
//while循环中的i可以在外面继续使用，而for的不可以
//只知道结束条件用while，只知道循环次数用for

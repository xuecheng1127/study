package com.aust.whileDemo;

public class WhileDemo4 {
    public static void main(String[] args) {
        /*世界最高的删是珠穆朗玛峰，高度为8848.86m，假如我有一张足够大的纸张，它的厚度为0.1mm，请问对折多少次可以到
        世界最高山的高度*/
        double thickness = 0.1;
        int count = 0;
        while (thickness < 8848860) {
            thickness *= 2;
            count++;
        }
        System.out.println("对折" + count + "次可以达到珠穆朗玛峰的高度");
    }
}

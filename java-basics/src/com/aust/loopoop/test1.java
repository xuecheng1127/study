package com.aust.loopoop;

public class test1 {
    //打印四成五的*号
    public static void main(String[] args) {
        /*for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        //打印九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
//print表示打印后不换行，println表示打印后换行
//\t表示制表符,简单理解，长度可变的大空格，打印表格数据的时候可以让其上下对齐
//在前面的字符后面补一到四个空格，让这个整体的长度凑成四的倍数

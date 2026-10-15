package com.aust.operate;
import java.util.Scanner;
public class OperateDemo2  {
    public static void main(String[] args) {
        System.out.println("请输入一个百位数：");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        int b=(a/100)%10;
        System.out.println("百位数是："+b);
        int c=(a/10)%10;
        System.out.println("十位数是："+c);
        int d=a%10;
        System.out.println("个位数是："+d);
    }

}

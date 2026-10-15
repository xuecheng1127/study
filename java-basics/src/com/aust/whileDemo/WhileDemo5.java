package com.aust.whileDemo;

import java.util.Scanner;

public class WhileDemo5 {
    public static void main(String[] args) {    
        //数位之和，给定一个整数n，请计算所有位数之和。若n为负数，请先取其绝对值
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num=scanner.nextInt();
        //取绝对值
        num=Math.abs(num);
        //确定输入的整数的位数
        int count=0;
        int sum=0;
        int temp=num;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        System.out.println("该整数的位数为："+count);
        //确定位数后，计算每一位数之和

        while(num!=0){
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println("该整数的所有位数之和为："+sum);
    }
}

package com.aust.controlloop;
import java.util.Scanner;
public class BreakDemo3 {
    public static void main(String[] args) {
        //输入一个小于等于二的数字判断其是否为质数
        //判断这个数是否大于二
        int num=0;
                System.out.println("输入一个小于等于二的数字判断其是否为质数");
        Scanner sc = new Scanner(System.in);
        while(true) {
            num = sc.nextInt();
            if (num >= 2) {
                break;}
                else System.out.println("输入的数字不大于2");

            }
        //判断num是否为质数
        int count=0;
        for (int i = 2; i <= Math.sqrt(num); i++)
            if(num%i==0){
                count++;
                break;    }    ;
        if(count==0)
            System.out.println("是质数");
        else
            System.out.println("不是质数");

            }


        }





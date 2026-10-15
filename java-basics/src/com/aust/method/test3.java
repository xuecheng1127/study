package com.aust.method;

import java.util.Scanner;
public class test3 {

public static void main(String[] args) {
    System.out.println("请输入快递重量：");
    Scanner scanner = new Scanner(System.in);
    double weight=0;

    while(true){
    weight = scanner.nextDouble();
    if(weight<=0) {

            System.out.println("重量必须大于0,请重新输入");
            continue;
        }
        else
            break;
    }
    double result = calculate1(weight) + calculate2(weight) + calculate3(weight);
    System.out.println("需要运费：" + result+"元");
    }
    /*
    某快递公司的运费规则如下（首重1kg，超出部分按kg计算，不足1kg按1kg算
    首重1kg；10元
    超出1~5kg：每kg加2元
    超出5kg以上；每kg加1.5元
    键盘录入小数，表示用户快递重量，计算最终的结果
    要求1，快递重量必须大于0
    要求2.不同价位的计算单独定义一个方法
     */

    public static double calculate1(double weight) {
        return 10;
    }
    public static  double calculate2(double weight) {
        if(weight>1){
            if(weight<=5)
            {
                double q=(int)(weight-1);
                if ((weight-1)>q){
                    return 2*(q+1);
                }
                else return 2*q;


            }


            else
                return 8;}
        else return 0;

    }
    public static double calculate3(double weight) {
        if(weight>5) {
            double q =  (int) (weight - 5);
            if((weight-5)>q)
                return 1.5*(q+1);
            else return 1.5*q;

        }
        else return 0;
    }
}

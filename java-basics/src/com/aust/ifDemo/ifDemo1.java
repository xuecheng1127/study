package com.aust.ifDemo;
import java.util.Scanner;

public class ifDemo1 {
    public static void main(String[] args) {
        /*计算bmi：
        键盘录入身高体重
        bmi数值 小于 18.5 为轻度体重
        18.5-24.9 为正常体重
        25-27.9 为过重
        28-30.9 为肥胖
        大于30 为严重肥胖
        输出bmi数值和体重状态*/
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入身高：");
        double height=sc.nextDouble();
        System.out.println("请输入体重：");
        double weight=sc.nextDouble();
        double bmi=weight/(height*height);
        System.out.println("bmi="+bmi);
        if(bmi<18.5){
            System.out.println("过轻");
        }else if(bmi>=18.5&&bmi<24.9){
            System.out.println("正常");
        }else if(bmi>=25&&bmi<27.9){
            System.out.println("偏胖");
        }else if(bmi>=28&&bmi<30.9){
            System.out.println("肥胖");
        }else{
            System.out.println("严重肥胖");
        }


    }
}

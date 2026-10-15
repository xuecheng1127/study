package com.aust.variable;
import java.util.Scanner;
public class variableDemo8 {
    public static void main(String[] args)
    {
        //输入体重
        System.out.println("请输入体重：");
        Scanner sc=new Scanner(System.in);
        double weight=sc.nextDouble();
        System.out.println("weight="+weight);
        //输出体重
        //输入身高
        System.out.println("请输入身高：");
        double height=sc.nextDouble();
        System.out.println("height="+height);
        //输出身高
        //计算BMI公式 身高^2*体重
        double bmi=height*height*weight;
        System.out.println("BMI="+bmi);
    }


}

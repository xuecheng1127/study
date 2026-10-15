package com.aust.variable;
//确定Scanner位置
import java.util.Scanner;

public class variableDemo6 {
    public static void main(String[] args) {
        /*键盘录入
                第一步：找到Scanner这个类
                第二步：让scanner干活*/
        Scanner sc=new Scanner(System.in);
                //创建Scanner对象
        //让scannner干活
        //接受键盘录入的整数
        int num=sc.nextInt();
        System.out.println("num="+num);
        //接受键盘录入的小数
        double num2=sc.nextDouble();
        System.out.println("num2="+num2);
        //接受键盘录入的文本
        String str=sc.next();//文本用next即可
        System.out.println("str="+str);


    }
}

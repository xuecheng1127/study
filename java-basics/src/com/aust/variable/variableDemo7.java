package com.aust.variable;
import java.util.Scanner;
public class variableDemo7
{
    public void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num=sc.nextInt();
        System.out.println("num="+num);
        System.out.println("请输入第二个整数");
        int num2=sc.nextInt();
        System.out.println("num2="+num2);
        System.out.println("两个整数的和为："+(num+num2));

    }
}

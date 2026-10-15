package com.aust.forDemo;
import java.util.Scanner;
public class ForDemo2 {
    public static void main(String[] args) {
        /*有一组特殊的数字，从第三项开始，每一项都是前两项的数字和，请问第十项数字为多少
                用户输入前两个数字然后计算出第十个数字*/
        System.out.println("请输入前两个数字：");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum=0;
        for(int i=3;i<=10;i++)
        {sum=a+b;
            a=b;
            b=sum;}
        System.out.println("第十个数字为："+sum);

    }
}

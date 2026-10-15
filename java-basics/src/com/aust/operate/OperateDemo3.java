package com.aust.operate;
import java.util.Scanner;
public class OperateDemo3  {
    public static void main(String[] args)
    {
       //时间转换，将秒数转换为小时分钟和秒
        System.out.println("请输入秒数：");
        Scanner sc=new Scanner(System.in);
        int second=sc.nextInt();
        int hour=second/3600;
        int minute=(second%3600)/60;
        int second2=second%60;
        System.out.println(hour+"小时"+minute+"分钟"+second2+"秒");
    }
}

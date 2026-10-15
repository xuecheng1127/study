package com.aust.variable;
import java.util.Scanner;

public class variableDemo9 {
    public static void main(String[] args) {
        //用户输入一个数字，判断是否为偶数
            Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }

    }
}

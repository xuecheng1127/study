package com.aust.arry;

import java.util.Random;
import java.util.Scanner;
public class arryDemo3 {
    public static void main(String[] args) {
        //数组动态初始化
        int[] arr = new int[5];
        /*for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
            System.out.println(arr[i]);
            动态初始化随机数
        }*/
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  sc.nextInt();
            System.out.println("请输入一个整数");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

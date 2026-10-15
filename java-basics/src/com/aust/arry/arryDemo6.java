package com.aust.arry;

import java.util.Scanner;

public class arryDemo6 {
    /*已知数组元素
    键盘录入一个数据，查找这个数据在数组中是否存在
    如果数组中要查找的数据存在多次
    只要显示第一次的索引即可
    输出要求：
    如果数组中不存在这个数据，输出：不存在
    如果数组中存在这个数据，输出：存在，索引为：XX*/

    public static void main(String[] args) {
        int[] arr={33,5,22,44,55,33};
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数据：");
        int num=sc.nextInt();
        int i=0;
        for( i=0;i<arr.length;i++)
            if(arr[i]==num){
                System.out.println("存在，索引为："+i);
                flag=true;
                break;
            }
        if (!flag){
            System.out.println("不存在");

            }

    }
}

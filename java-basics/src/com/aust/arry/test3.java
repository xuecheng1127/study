package com.aust.arry;

import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        //随机生成一段无序数组，按顺序排成有序数组，然后去除其中的重复元素，再将其打印出来
        //生成无序数组并不含有重复元素
        Random r = new Random();
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=r.nextInt(100)+1;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    i--;
                    break;
                }
            }
        }
        //将无序数组排列成有序数组（冒泡排序：内层只比较相邻元素）
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}

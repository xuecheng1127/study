package com.aust.arry;

public class arryDemo7 {
    public static void main(String[] args) {
        int arr[] = {14, 23, 31, 45, 5};
        int i=0;
        int a=arr[0];
        for(i=0;i<arr.length;i++){
            if (arr[i] > a) {
                a = arr[i];
            }

        }
        System.out.println("最大值为："+a);
    }
}
//这里的最大值初始化不能设置成0，遇到负数就会产生歧义
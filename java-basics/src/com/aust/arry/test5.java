package com.aust.arry;

public class test5 {
    public static void main(String[] args) {
        /*合并有序数组
        给两个数组的数据合并到一个大数组中
                要求:合并后的大数组也是有序的*/
        int arr1[] = {11, 3, 5, 17, 9};
        int arr2[] = {2, 34, 6, 28, 10};
        int arr3[] = new int[arr1.length + arr2.length];
        for(int i = 0; i <= arr3.length-1; i++) {
            arr3[i] = arr1[i];
            arr3[i+arr1.length-1] = arr2[i];
        }
        for(int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}

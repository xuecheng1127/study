package com.aust.Memory;

public class MemoryDemo2 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        printarry(arr);
        change(arr);
        printarry(arr);
        System.out.println(arr);
        //数组是省略写法，实际传的是地址而非数值，因此可以直接改里面的数据
    }

    public static void change(int arr[]) {
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;

    }
    public static void printarry(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

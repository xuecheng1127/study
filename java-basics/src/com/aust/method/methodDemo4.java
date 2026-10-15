package com.aust.method;

public class methodDemo4 {
    //定义一个方法遍历数组
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArr(array);
    }
    public static void printArr(int[] arr) {
        //没有返回值的，不需要把结果返回给上面的调用处，此时返回值类型void
        System.out.print("[");
        for (int i = 0; i < arr.length; i++)
        {

            if (i == arr.length - 1)
                System.out.print(arr[i]);
            else
            { System.out.print(arr[i] + " ，");}

        }
        System.out.print("]");
    }
}

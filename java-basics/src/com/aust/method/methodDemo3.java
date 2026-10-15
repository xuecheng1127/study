package com.aust.method;

import static com.aust.method.methodDemo2.getRandomNumber;

public class methodDemo3 {
    public static void main(String[] args) {
        int[] array = getRandomNumber();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    //定义一个方法，判断num在数组arr中是否存在
    public static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

}

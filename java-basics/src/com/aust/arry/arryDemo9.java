package com.aust.arry;
import java.util.Random;
public class arryDemo9 {
    //目标；打乱数组中的数据
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //打乱数组中的数据
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int j = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

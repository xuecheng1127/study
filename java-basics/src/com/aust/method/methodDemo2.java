package com.aust.method;

import java.util.Random;

import java.util.Random;
public class methodDemo2 {
    public static void main(String[] args) {
        int[] array = getRandomNumber();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        /*获取10个1到一百的随机数并存入数组当中，要求保证数据是唯一的
        写入方法中*/
    }
    public static int[] getRandomNumber () {
        int[] array = new int[10];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100) + 1;
            for(int j = 0; j < i; j++)
                if(array[i] == array[j]) {
                    i--;
                    break;
                }
        }
        return array;
    }
}

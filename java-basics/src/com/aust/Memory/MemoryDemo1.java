package com.aust.Memory;

public class MemoryDemo1 {

    public  static void main(String[] args) {

        int a=10;
        int b=20;
        System.out.println("交换前；"+a+","+b);
        change(a,b);
        System.out.println("交换后；"+a+","+b);

    }
    public static void change(int a,int b) {
        int temp=a;
        a=b;
        b=temp;

    }

}

package com.aust.arry;

public class arryDemo1 {
    /*    数组的静态初始化
    1.定义数组存储3位同学的年龄
    2.定义数组存储5位同学的身高
    3.定义数组存储3位同学的名字*/
    public static void main(String[] args) {
        int[] agearr = {18, 19, 20};
        double[] heightarr = {1.75, 1.76, 1.77, 1.78, 1.79};
        String[] namearr = {"张三", "李四", "王五"};
        System.out.println("年龄数组的长度是：" + agearr[0]  );
        System.out.println("身高数组的长度是：" + heightarr.length);
        System.out.println("名字数组的长度是：" + namearr.length);
    }
}
